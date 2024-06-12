import java.util.HashMap;
import java.util.Map;

public class TelephoneBook1 {
    public static void main(String[] args) {
        //Create a map with the following key-value pairs:
        //
        //Name (key)	Phone number (value)
        //William A. Lathan	405-709-1865
        //John K. Miller	402-247-8568
        //Hortensia E. Foster	606-481-6467
        //Amanda D. Newland	319-243-5613
        //Brooke P. Askew	307-687-2982
        //Create an application which prints out the answers to the following questions:

        //What is John K. Miller's phone number?
        //Whose phone number is 307-687-2982?
        //Do we know Chris E. Myers' phone number? (yes/no)
        //The full output of your main method should be the following:
        //
        //402-247-8568
        //Brooke P. Askew
        //no

        HashMap<String, String> telBook = new HashMap<>();
        telBook.put("William A. Lathan","405-709-1865");
        telBook.put("John K. Miller","402-247-8568");
        telBook.put("Hortensia E. Foster","606-481-6467");
        telBook.put("Amanda D. Newland","319-243-5613");
        telBook.put("Brooke P. Askew","307-687-2982");

        //What is John K. Miller's phone number?
        System.out.println(telBook.get("John K. Miller"));

        //Whose phone number is 307-687-2982? // UNSOLVED
        String who = "307-687-2982";

       if (telBook.values().equals(307-687-2982)) {
           System.out.println(telBook.get("Brooke P. Askew"));
        } else {
           System.out.println("false");
       }

        //Do we know Chris E. Myers' phone number? (yes/no)

        if (telBook.containsKey("Chris E. Myers")) {
            System.out.println(telBook.get("Chris E. Myers"));
        } else {
            System.out.println("no");
        }




    }
}
