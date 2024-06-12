package StreamsAndLambdas.Exercise1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    //Exercise 1
    //Write a method to return a list of even numbers from the list of integers below using the Stream API.
    //
    //List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    //
    //List<Integer> expectedOutput = Arrays.asList(-2, -4, -8, 12, 6, 10, 14);


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> evenNumbers = getEvenNumbers(numbers);

        System.out.println(evenNumbers);
    }

    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return  numbers.stream()
                .filter(f -> f % 2 == 0)
                .collect(Collectors.toList());
    }

}
