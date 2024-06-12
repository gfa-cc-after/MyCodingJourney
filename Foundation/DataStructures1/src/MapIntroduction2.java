import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
        //Create a map where the keys are strings and the values are strings with the following initial values
        //
        //Key	Value
        //978-1-60309-452-8	A Letter to Jo
        //978-1-60309-459-7	Lupus
        //978-1-60309-444-3	Red Panda and Moon Bear
        //978-1-60309-461-0	The Lab
        //Print all the key-value pairs in the following format  //
        //
        //A Letter to Jo (ISBN: 978-1-60309-452-8)
        //Lupus (ISBN: 978-1-60309-459-7)
        //Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
        //The Lab (ISBN: 978-1-60309-461-0)
        //Remove the key-value pair with key 978-1-60309-444-3  //
        //
        //Remove the key-value pair with value The Lab //
        //
        //Add the following key-value pairs to the map //
        //
        //Key	Value
        //978-1-60309-450-4	They Called Us Enemy
        //978-1-60309-453-5	Why Did We Trust Him? //
        //Print whether there is an associated value with key 478-0-61159-424-8 or not
        //
        //Print the value associated with key 978-1-60309-453-5
        //
        //The full output of your main method should be the following:
        //
        //A Letter to Jo (ISBN: 978-1-60309-452-8)
        //Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
        //Lupus (ISBN: 978-1-60309-459-7)
        //The Lab (ISBN: 978-1-60309-461-0)
        //false
        //Why Did We Trust Him?

        HashMap<String, String> Map2 = new HashMap<>();
        Map2.put("978-1-60309-452-8","A Letter to Jo");
        Map2.put("978-1-60309-459-7","Lupus");
        Map2.put("978-1-60309-444-3","Red Panda and Moon Bear");
        Map2.put("978-1-60309-461-0","The Lab");

        // Print all the key-value pairs in the following format {reverse} //
        Map2.forEach((key, value) -> System.out.println(value + " (ISBN: " + key + ")"));

        //Remove the key-value pair with key 978-1-60309-444-3 //
        Map2.remove("978-1-60309-444-3");
        //Remove the key-value pair with value The Lab //
        Map2.values().removeIf(value -> "The Lab".equals(value));

        System.out.println("");
        System.out.println(Map2);
        System.out.println("");

        // Add the following key-value pairs to the map
        Map2.put("978-1-60309-450-4","They Called Us Enemy"); //
        Map2.put("978-1-60309-453-5","Why Did We Trust Him?"); //

        Map2.forEach((key, value) -> System.out.println(value + " (ISBN: " + key + ")"));

       String keyToCheck = "478-0-61159-424-8";
       String associatedValue = Map2.get(keyToCheck);

       if (associatedValue != null) {
           System.out.println(true);
          } else {
           System.out.println(false);
       }

        //Print the value associated with key 978-1-60309-453-5
        System.out.println(Map2.get("978-1-60309-453-5"));

    }
}
