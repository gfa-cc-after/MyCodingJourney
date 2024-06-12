package com.greenfoxacademy.foxclub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    private List<Fox> foxes;
    private List<String> allTricks = Arrays.asList("Backflip", "Roll Over", "High Five", "Fetch", "Jump Through Hoop");
    private List<String> learnedTricks = new ArrayList<>(); // List to store learned tricks

    public MainController() {
        this.foxes = new ArrayList<>();
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("name") String name, RedirectAttributes redirectAttributes) {
        // Validate the provided name and create a new Fox
        Fox fox = new Fox(name);
        foxes.add(fox);

        // Redirect to the Information Page with the Fox's name as a query parameter
        return "redirect:/info?name=" + name;
    }

    @GetMapping("/info")
    public String showInfoPage(@RequestParam(value = "name", required = false) String name, Model model) {
        if (name == null) {
            // Handle case where name parameter is not present
            return "redirect:/login";
        }

        // Find the Fox by name
        Fox fox = findFoxByName(name);

        // If no fox is found, redirect to login page
        if (fox == null) {
            return "redirect:/login";
        }

        // Add the Fox to the model
        model.addAttribute("fox", fox);

        // Add learned tricks to the model
        if (fox.getTricks() != null) {
            model.addAttribute("learnedTricks", fox.getTricks());
        }

        // Add food eaten to the model
        if (fox.getFood() != null) {
            model.addAttribute("foodEaten", fox.getFood());
        }

        // Add drink consumed to the model
        if (fox.getDrink() != null) {
            model.addAttribute("drinkConsumed", fox.getDrink());
        }

        return "info";
    }

    // Method to find a Fox by name
    private Fox findFoxByName(String name) {
        for (Fox fox : foxes) {
            if (fox.getName().equals(name)) {
                return fox;
            }
        }
        return null; // Return null if Fox is not found
    }

    // Incorporate the existing validation logic here
    private boolean isValidName(String name) {
        return name != null && !name.isEmpty();
    }

    // nutrition store below

    public List<String> foods = Arrays.asList("Muffins", "Fluffy grass", "FishCake", "Pizza");
    public List<String> drinks = Arrays.asList("Water", "Coke", "Slim Coffe", "Green Tea", "Milk");

    @GetMapping("/nutritionStore")
    public String showNutritionStore(Model model1){
        model1.addAttribute("foods", foods);
        model1.addAttribute("drinks",drinks);
        return "nutritionStore";
    }

    // this updates fox food and drinkos
    @PostMapping("/changeNutrition")
    public String changeNutrition(@RequestParam("food")String food, @RequestParam("drink") String drink){
        return "redirect:/nutritionStore";
    }

    // Trick Center below

    @GetMapping("/trickCenter")
    public String showTrickCenter(Model model) {
        model.addAttribute("tricks", allTricks);
        model.addAttribute("learnedTricks", learnedTricks);
        return "trickCenter";
    }

    // Method to learn a new trick
    @GetMapping("/learnTrick")
    public String learnTrick(String trick) {
        // Check if the trick has already been learned
        if (!learnedTricks.contains(trick)) {
            learnedTricks.add(trick); // Add the trick to the learned tricks list
        }
        return "redirect:/trickCenter";
    }
}
