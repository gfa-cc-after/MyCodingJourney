
import java.util.HashMap;

public class ShoppingList2 {
    public static void main(String[] args) {
        //Represent the following products with their prices:
        //
        //Product	Price
        //Milk	1.07
        //Rice	1.59
        //Eggs	3.14
        //Cheese	12.60
        //Chicken Breasts	9.40
        //Apples	2.31
        //Tomato	2.58
        //Potato	1.75
        //Onion	1.10
        //Represent Bob's shopping list:
        //
        //Product	Amount
        //Milk	3
        //Rice	2
        //Eggs	2
        //Cheese	1
        //Chicken Breasts	4
        //Apples	1
        //Tomato	2
        //Potato	1
        //Represent Alice's shopping list:
        //
        //Product	Amount
        //Rice	1
        //Eggs	5
        //Chicken Breasts	2
        //Apples	1
        //Tomato	10
        //Create an application which prints out the answers to the following questions:
        //
        //How much does Bob pay?
        //How much does Alice pay?
        //Who buys more Rice?
        //Who buys more Potato?
        //Who buys more Ham?
        //Who buys more Apples?
        //Who buys more of different products?
        //Who buys more items? (more pieces)
        //The full output of your main method should be the following:
        //
        //72.09
        //64.2
        //Bob
        //Bob
        //no one
        //no one
        //Bob
        //Alice

        HashMap<String, Double> priceList = new HashMap<>();

        priceList.put("Milk", 1.07);
        priceList.put("Eggs", 3.14);
        priceList.put("Cheese", 12.60);
        priceList.put("Chicken Breasts", 9.40);
        priceList.put("Apples", 2.31);
        priceList.put("Tomato", 2.58);
        priceList.put("Potato", 1.75);
        priceList.put("Onion", 1.10);

        HashMap<String, Integer> Bob = new HashMap<>();
        Bob.put("Milk", 3);
        Bob.put("Rice", 2);
        Bob.put("Eggs", 2);
        Bob.put("Cheese", 1);
        Bob.put("Chicken Breasts", 4);
        Bob.put("Apples", 1);
        Bob.put("Tomato", 2);
        Bob.put("Potato", 1);

        HashMap<String, Integer> Alice = new HashMap<>();
        Alice.put("Rice", 1);
        Alice.put("Eggs", 5);
        Alice.put("Chicken Breasts", 2);
        Alice.put("Apples", 1);
        Alice.put("Tomato", 10);

        //How much does Bob pay?
        double bobTotalCost = 0.0;
        for (int i = 0; i < Bob.size() ; i++) {
            String product = (String) Bob.keySet().toArray()[i];

            int amount = Bob.getOrDefault(product, 0);
            double price = priceList.getOrDefault(product, 0.0);
            bobTotalCost += amount * price;
        }

        System.out.println("Bobs total cost: " + bobTotalCost);


        //How much does Alice pay?
        double aliceTotalCost = 0.0;
        for (int i = 0; i < Alice.size() ; i++) {
            String product = (String) Alice.keySet().toArray()[i];

            int amount = Alice.getOrDefault(product, 0);
            double price = priceList.getOrDefault(product, 0.0);
            aliceTotalCost += amount * price;
        }

        System.out.println("Alices total cost: " +aliceTotalCost);


        //Who buys more Rice?
        if (Bob.get("Rice").doubleValue() > Alice.get("Rice").doubleValue()) {
            System.out.println( "bob");
        } else {
            System.out.println("alice");
        }
        //Who buys more Potato?

        Integer bobPotatoQuantity = Bob.get("Potato");
        Integer alicePotatoQuantity = Alice.get("Potato");

        if (bobPotatoQuantity != null && alicePotatoQuantity != null) {
            if (bobPotatoQuantity.doubleValue() > alicePotatoQuantity.doubleValue()) {
                System.out.println("Bob");
            } else if (bobPotatoQuantity.doubleValue() < alicePotatoQuantity.doubleValue()) {
                System.out.println("Alice");
            } else {
                System.out.println("No one");
            }
        } else if (bobPotatoQuantity != null) {
            System.out.println("Bob");
        } else if (alicePotatoQuantity != null) {
            System.out.println("Alice");
        } else {
            System.out.println("No one");
        }

        //Who buys more Ham?

        Integer bobHamQuantity = Bob.get("Ham");
        Integer aliceHamQuantity = Alice.get("Ham");

        if (bobHamQuantity != null && aliceHamQuantity != null) {
            if (bobHamQuantity.doubleValue() > aliceHamQuantity.doubleValue()) {
                System.out.println("Bob");
            } else if (bobHamQuantity.doubleValue() < aliceHamQuantity.doubleValue()) {
                System.out.println("Alice");
            } else {
                System.out.println("No one");
            }
        } else if (bobHamQuantity != null) {
            System.out.println("Bob");
        } else if (alicePotatoQuantity != null) {
            System.out.println("Alice");
        } else {
            System.out.println("ham : No one");
        }



        //Who buys more Apples?
        if (Bob.get("Apples").doubleValue() > Alice.get("Apples").doubleValue()) {
            System.out.println( "bob");
        } else if (Bob.get("Apples").doubleValue() < Alice.get("Apples").doubleValue()) {

        } else {
            System.out.println("apples no one");
        }


        //Who buys more of different products?

        if (Bob.size() > Alice.size() ) {
            System.out.println( "bob");
        } else if (Bob.size() < Alice.size() ) {
            System.out.println("alice");
        } else {
            System.out.println("no one");
        }


        //Who buys more items? (more pieces)

        int BobTotalItems = Bob.values().stream().mapToInt(Integer::intValue).sum();

        int AliceTotalItems =Alice.values().stream().mapToInt(Integer::intValue).sum();

        if (BobTotalItems > AliceTotalItems) {
            System.out.println("Bob has more pieces");
        } else if (BobTotalItems < AliceTotalItems) {
            System.out.println("Alice has more pices");
        } else {
            System.out.println("no one");
        }


    }
}
