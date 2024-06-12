import java.util.ArrayList;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
    //Create a list ('List A') which contains the following values
    //Apple, Avocado, Blueberries, Durian, Lychee
    //Create a new list ('List B') with the values of List A
    //Printout whether List A contains "Durian" or not
    //Remove "Durian" from List B
    //Add "Kiwifruit" to List A after the 4th element
    //Compare the size of List A and List B
    //Get the index of "Avocado" from List A
    //Get the index of "Durian" from List B
    //Add "Passion Fruit" and "Pomelo" to List B in a single statement
    //Print out the 3rd element from List A
    //Print all elements of List A
    //Print all elements of List B
    //The full output of your main method should be the following:

        //true
        //false
        //1
        //-1
        //Blueberries
        //[Apple, Avocado, Blueberries, Durian, Kiwifruit, Lychee]
        //[Apple, Avocado, Blueberries, Lychee, Passion Fruit, Pomelo]

        ArrayList<String> ListA = new ArrayList<>();
        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");

        //Create a new list ('List B') with the values of List A
        ArrayList<String> ListB = new ArrayList<>(ListA);

        //Printout whether List A contains "Durian" or not
        System.out.println("List A contains \"Durian\": " + ListA.contains("Durian"));

        ListB.remove("Durian");

        //Add "Kiwifruit" to List A after the 4th element
        ListA.add(4,"KiwiFruit");

        System.out.println(ListA==ListB);
        System.out.println(ListA.indexOf("Avocado"));
        System.out.println(ListB.indexOf("Durian"));
        //Add "Passion Fruit" and "Pomelo" to List B in a single statement
        ListB.addAll(List.of("Passion Fruit", "Pomelo"));

        //Print out the 3rd element from List A

        System.out.println(ListA.get(2));

        System.out.println(ListA);
        System.out.println(ListB);
    }
}
