import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase1 {
    public static void main(String[] args) {
        // Product database
        //We are going to represent our products in a map where the keys are strings representing the product's name and the values are numbers representing the product's price.
        //
        //Create a products map with the following key-value pairs:
        //
        //Product name (key)	Price (value)
        //Eggs	200
        //Milk	200
        //Fish	400
        //Apples	150
        //Bread	50
        //Chicken	550
        //Create an application which prints out the answers to the following questions:
        //
        //How much is the fish?
        //What is the most expensive product?
        //What is the average price?
        //How many products' price is below 300?
        //Is there anything we can buy for exactly 125?
        //What is the cheapest product?
        //The full output of your main method should be the following:
        //400
        //Chicken
        //258.33334
        //4
        //no
        //Bread

        HashMap<String, Integer> Productlist = new HashMap<>();
        Productlist.put("Eggs", 200);
        Productlist.put("Milk", 200);
        Productlist.put("Fish", 400);
        Productlist.put("Apples", 150);
        Productlist.put("Bread", 50);
        Productlist.put("Chicken", 550);


        //How much is the fish?

        int fishPrice = Productlist.get("Fish");
        System.out.println(fishPrice);

        //What is the most expensive product?

        Map.Entry<String, Integer> mostExpensiveProductEntry = Productlist.entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .orElse(null);

        if (mostExpensiveProductEntry != null) {
            String mostExpensiveProduct = mostExpensiveProductEntry.getKey();
            System.out.println("The most expensive product is: " + mostExpensiveProduct);
        } else {
            System.out.println("No product found in the database.");
        }


        //What is the average price?

        double totalPrice = Productlist.values().stream().mapToInt(Integer::intValue).sum();

        double avgPrice = totalPrice / Productlist.size();
        System.out.println(avgPrice);


        //How many products' price is below 300?

        // long equivalent
       //  long below300Products = Productlist.values().stream().filter(price -> price < 300).count();

        int below300Products = (int) Productlist.values().stream().filter(price -> price < 300).count();
        System.out.println(below300Products);

        //Is there anything we can buy for exactly 125?

        boolean somethingFor125 = Productlist.values().stream().anyMatch(price -> price == 125  );
        System.out.println(somethingFor125);

        //What is the cheapest product?
        Map.Entry<String, Integer> cheapestProductEntry = Productlist.entrySet().stream()
                .min(Comparator.comparingInt(Map.Entry::getValue))
                .orElse(null);

        if (cheapestProductEntry != null) {
            String cheapestProduct = cheapestProductEntry.getKey();
            System.out.println("cheapest product is : " + cheapestProduct);
        } else {
            System.out.println("No product found in the database.");
        }


    }
}
