public class ReverseString5 {

    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Call the reverse method and print the result
        System.out.println(reverse(toBeReversed));
    }

    // Method to reverse a string using charAt() function
    public static String reverse(String input) {
        // Create a StringBuilder to store the reversed string
        StringBuilder reversed = new StringBuilder();

        // Iterate through the characters in reverse order and append to the StringBuilder
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        // Convert StringBuilder to String and return the result
        return reversed.toString();
    }
}
