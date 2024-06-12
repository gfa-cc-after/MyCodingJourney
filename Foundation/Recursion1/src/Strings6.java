public class Strings6 {

    public static void main(String[] args) {

        // Given a string, write a recursive (no loops) method which returns
        // a new string with the lowercase 'x' chars changed to 'y' chars.


        // Test the function with different examples
        System.out.println(replaceXwithY("xyxabc"));      // Output: yyyabc
        System.out.println(replaceXwithY("xXxXhelloX"));   // Output: yYyYhelloY
        System.out.println(replaceXwithY("abcXYZ"));      // Output: abcXYZ (no 'x' to replace)
    }

    public static String replaceXwithY(String input) {
        // Base CASE : if the input string is empty >>>>> return an empty string
        if (input.isEmpty()) {
            return "";
        } else {
            // Recursive case: replace 'x' with 'y' in the current character
            char currentChar = input.charAt(0);
            char replacedChar = (currentChar == 'x') ? 'y' : currentChar;

            // Concatenate the replaced character with the result of the recursive call on the rest of the string
            return replacedChar + replaceXwithY(input.substring(1));
        }
    }
}
