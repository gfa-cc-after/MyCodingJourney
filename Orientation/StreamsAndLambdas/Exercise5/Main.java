package StreamsAndLambdas.Exercise5;

import java.util.Arrays;
import java.util.List;

public class Main {
    //Write a method to return the sum of odd numbers in the list of integers below using the Stream API.
    //
    //List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    //
    //int expectedOutput = 61;
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        int sumOfOddNumbers = getSumOfOddNumbers(numbers);
        System.out.println(sumOfOddNumbers); // Output: 61
    }

    public static int getSumOfOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0) // Filter odd numbers
                .mapToInt(Integer::intValue) // Convert Integer to int for sum calculation - without this no calculation is happening
                .sum(); // sum calculation
    }
}
