import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        //Create a list with the following items:
        //eggs, milk, fish, apples, bread and chicken
        //Create an application which prints out the answers to the following questions:
        //Do we have milk in the shopping list? (yes/no)
        //Do we have bananas in the shopping list? (yes/no)
        //The full output of your main method should be the following:
        //
        //yes
        //no

        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("eggs");
        shoppingList.add("milk");
        shoppingList.add("fish");
        shoppingList.add("apples");
        shoppingList.add("bread");
        shoppingList.add("chicken");

        if (shoppingList.contains("milk")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        if (shoppingList.contains("bananas")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }




    }
}
