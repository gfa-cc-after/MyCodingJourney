package com.greenfoxacademy.basicwebshop;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping("/webshop")
public class WebshopController {

    private List<ShopItem> shopItems = new ArrayList<>();

    public WebshopController() {
        // Predefined list of items
        shopItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
        shopItems.add(new ShopItem("Printer", "some HP printer that will print pages", 3000, 2));
        shopItems.add(new ShopItem("Coca cola", "0.5l standart coke", 25, 0));
        shopItems.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100));
        shopItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1));
    }

    @GetMapping
    public String showWebshop(Model model) {
        model.addAttribute("shopItems", shopItems);
        return "webshop";
    }

    @GetMapping("/contains-nike")
    public String showItemsContainingNike(Model model) {
        List<ShopItem> nikeItems = new ArrayList<>();
        for (ShopItem item : shopItems) {
            if (item.getName().toLowerCase().contains("nike") || item.getDescription().toLowerCase().contains("nike")) {
                nikeItems.add(item);
            }
        }
        model.addAttribute("shopItems", nikeItems);
        return "webshop";
    }

    @GetMapping("/average-stock")
    public ResponseEntity<Double> getAverageStock() {
        double totalStock = 0;
        for (ShopItem item : shopItems) {
            totalStock += item.getQuantityInStock();
        }
        double averageStock = totalStock / shopItems.size();
        return ResponseEntity.ok(averageStock);
    }

    @GetMapping("/most-expensive")
    public ResponseEntity<ShopItem> getMostExpensive() {
        ShopItem mostExpensive = null;
        double maxPrice = 0;
        for (ShopItem item : shopItems) {
            if (item.getPrice() > maxPrice && item.getQuantityInStock() > 0) {
                mostExpensive = item;
                maxPrice = item.getPrice();
            }
        }
        return ResponseEntity.ok(mostExpensive);
    }
    @GetMapping("/cheapest-first")
    public ResponseEntity<List<ShopItem>> sortItemsByCheapestFirst() {
        // Check if the list of shop items is not already sorted by price
        if (!isSortedByPrice(shopItems)) {
            // If not sorted, sort the list by price
            shopItems.sort(Comparator.comparing(ShopItem::getPrice));
        }
        // Return ResponseEntity with the sorted items
        return ResponseEntity.ok().body(shopItems);
    }

    // Helper method to check if the list is already sorted by price
    private boolean isSortedByPrice(List<ShopItem> items) {
        for (int i = 1; i < items.size(); i++) {
            // If the price of the current item is greater than the price of the previous item, the list is not sorted
            if (items.get(i).getPrice() < items.get(i - 1).getPrice()) {
                return false;
            }
        }
        return true; // If the loop completes without finding unsorted items, the list is sorted
    }

    @PostMapping("/search")
    @ResponseBody
    public List<ShopItem> searchItems(@RequestParam String searchQuery) {
        List<ShopItem> searchResults = new ArrayList<>();
        String query = searchQuery.toLowerCase(); // Convert query to lowercase for case-insensitive search

        // Iterate over shopItems and filter those containing the searched keyword in the name or description
        for (ShopItem item : shopItems) {
            if (item.getName().toLowerCase().contains(query) || item.getDescription().toLowerCase().contains(query)) {
                searchResults.add(item);
            }
        }

        return searchResults;
    }


}
