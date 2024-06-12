package StreamsAndLambdas.Exercise2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    // Write a method to return a list of squares of positive numbers from the list of integers below using the Stream API.
    //
    //List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    //
    //List<Integer> expectedOutput = Arrays.asList(1, 9, 144, 361, 36, 81, 100, 196);

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> squarePositiveNumbers = getSquareOfPositiveNumbers(numbers);
        System.out.println(squarePositiveNumbers);
    }

    public static List<Integer> getSquareOfPositiveNumbers(List<Integer>numbers){
        return  numbers.stream()
                .filter(f -> f > 0) // Filter positive numbers
                .map(f -> f*f) // Map each number to its square
                .collect(Collectors.toList());
    }
}
