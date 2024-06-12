package StreamsAndLambdas.Exercise6;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    //Write a method to return a list of uppercase characters from a given string using the Stream API.
    //
    //String s = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit. Morbi nec mattis odio.";
    //
    //List<Character> expectedOutput = Arrays.asList('L', 'I', 'D', 'S', 'A', 'C', 'A', 'E', 'M');
    public static void main(String[] args) {

        String s = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit. Morbi nec mattis odio, TEst teSt tesT.";
        List<Character> uppercaseCharacters = getUppercaseCharacters(s);
        System.out.println(uppercaseCharacters); // Output: [L, I, D, S, A, C, A, E, M]
    }
    public static List<Character> getUppercaseCharacters(String s) {
        return s.chars()                           // Convert the string to an IntStream of Unicode code points
                .mapToObj(c -> (char) c)           // Convert each code point to a character
                .filter(Character::isUpperCase)   // Filter out the uppercase characters
                .collect(Collectors.toList());    // Collect the characters into a list
}
    }
