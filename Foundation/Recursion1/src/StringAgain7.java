public class StringAgain7 {

    public static void main(String[] args) {


        // Given a string, write a recursive (no loops) method which returns
        // a new string with the lowercase 'x' chars removed.

        // Test 
        System.out.println(removeX("xyxabc"));      // Output: yabc
        System.out.println(removeX("xXxXhelloX"));   // Output: hello
        System.out.println(removeX("abcXYZ"));      // Output: abcXYZ (no 'x' to remove
    }

    public static String removeX(String input) {
        //    BASECASE if the input string is empty, return an empty string
        if (input.isEmpty()) {
            return "";
        } else {
            // Recursive case: if the current character is 'x', skip it; otherwise, include it in the result
            char currentChar = input.charAt(0);
            String restOfString = removeX(input.substring(1));

            return (currentChar == 'x') ? restOfString : currentChar + restOfString;
        }
    }
}
