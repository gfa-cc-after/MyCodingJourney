package StreamsAndLambdas.Exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    //Write a method to return a list of numbers whose square is greater than 20 from the list of integers below using the Stream API. The value 20 should be one of the method's parameters.
    //
    //List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
    //
    //List<Integer> expectedOutput = Arrays.asList(9, 8, 6, 5);

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        int threshold = 20;
        List<Integer> numbersWithSquareGreaterThanThreshold  = getNumbersWithSquareGreaterThanThreshold(numbers, threshold);
        System.out.println(numbersWithSquareGreaterThanThreshold );
    }

    public static List<Integer> getNumbersWithSquareGreaterThanThreshold(List<Integer>numbers, int threshold){
        return numbers.stream()
                .filter(f -> f*f > threshold) // cause f*f is greater than int threshold that is 20
                .collect(Collectors.toList());
    }
}
