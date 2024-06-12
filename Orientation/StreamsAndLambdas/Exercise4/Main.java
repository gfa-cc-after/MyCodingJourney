package StreamsAndLambdas.Exercise4;

import java.util.Arrays;
import java.util.List;

public class Main {
    //Write a method to return the average of odd numbers in the list of integers below using the Stream API. Implement this without calculating the sum first!
    //
    //List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    //
    //double expectedOutput = 22.0/6.0;

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        double averageOfOddNumber = getAverageOfOddNumbers(numbers);
        System.out.println(averageOfOddNumber);

    }
    public static double getAverageOfOddNumbers(List<Integer>numbers) {
        return numbers.stream()
                .filter(f -> f % 2 != 0)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }
}
