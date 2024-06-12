import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {
        // Product database 2
        //We are going to represent our products in a map where the keys are strings representing the product's name and the values are numbers representing the product's price.
        //
        //Create a map with the following key-value pairs:
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
        //Which products cost less than 201? (just the name)
        //Which products cost more than 150? (name + price)
        //The full output of your main method should be the following:
        //
        //Apples
        //Eggs
        //Milk
        //Bread
        //Fish 400
        //Chicken 550
        //Eggs 200
        //Milk 200

        HashMap<String, Integer> ProductList2 = new HashMap<>();
        ProductList2.put("Eggs", 200);
        ProductList2.put("Milk", 200);
        ProductList2.put("Fish", 400);
        ProductList2.put("Apples", 150);
        ProductList2.put("Bread", 50);
        ProductList2.put("Chicken", 550);


        //Which products cost less than 201? (just the name)
        ProductList2.entrySet().stream().filter(entry -> entry.getValue() < 201)
                .map(Map.Entry::getKey).forEach(System.out::println);


        //Which products cost more than 150? (name + price)

        ProductList2.entrySet().stream().filter(entry -> entry.getValue() > 150)
                .map(Map.Entry::getKey).forEach(System.out::println);
    }
}
