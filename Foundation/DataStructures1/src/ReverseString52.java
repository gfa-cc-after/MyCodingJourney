public class ReverseString52 {
    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a string which is passed as parameter
        // The method should return the reversed string
        // Pass the `toBeReversed` variable to this method to check if it works well
        // At first, solve this task using the `charAt()` function
        // Try other solutions when you are done

        reverseAString(toBeReversed);

    }

 public static void reverseAString (String input) {

        StringBuilder sb1 = new StringBuilder(input);
     sb1.reverse();
     System.out.println(sb1.toString());
 }

}
