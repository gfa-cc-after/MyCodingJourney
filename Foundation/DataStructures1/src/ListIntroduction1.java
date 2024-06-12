import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {

        //Create an empty list which will contain names (strings)
        //Print out the number of elements in the list
        //Add "William" to the list
        //Print out whether the list is empty or not
        //Add "John" to the list
        //Add "Amanda" to the list
        //Print out the number of elements in the list
        //Print out the 3rd element
        //Iterate through the list and print out each name

        ArrayList<String> names = new ArrayList<>(); //Create an empty list which will contain names (strings)
        System.out.println(names.size()); //Print out the number of elements in the list

        names.add("William"); //Add "William" to the list
        System.out.println(names.isEmpty()); //Print out whether the list is empty or not

        names.add("John");  //Add "John" to the list
        names.add("Amanda");    //Add "Amanda" to the list

        System.out.println(names.size()); //Print out the number of elements in the list

        System.out.println(names.get(2)); //Print out the 3rd element

        //Iterate through the list and print out each name

        for (int i = 0; i < names.size()  ; i++) {
            System.out.println((i+1) + "." + names.get(i));
        }


       // Remove the 2nd element

        names.remove(1);

        // Iterate through the list in a reversed order and print out each name

        for (int i = names.size() -1; i >= 0; i--) {
            System.out.println( names.get(i));
        }


        // Remove all elements
        names.clear();


        // Print out the number of elements in the list
        System.out.println(names.size());


    }
}
