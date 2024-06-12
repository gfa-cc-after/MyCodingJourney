import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {

            // Write a program that reads a number from the standard input.
            // Next, the program will prompt the user to enter as many numbers
            // as the value of the first number the user entered.
            // Once the user enters all numbers the program will print
            // their sum and average.
            // Example:
            // How many numbers would you like to enter: 6
            // Enter number 1 of 6: 2
            // Enter number 2 of 6: 3
            // Enter number 3 of 6: 7
            // Enter number 4 of 6: 9
            // Enter number 5 of 6: 11
            // Enter number 6 of 6: 0
            // Sum: 32, Average: 5.333333333333333

        Scanner scan1 = new Scanner(System.in);
        System.out.println("How many number would you like to enter: ");
        int userInput = scan1.nextInt();

        int sum = 0;
        for (int i = 1; i < userInput +1; i++) {
            System.out.println("plese enter a number: " + i +" of " + userInput);
            int number = scan1.nextInt();
            sum += number;
        }

        float average = (float) sum /userInput;
        System.out.println("Sum: " + sum + ", Average: " + average);

        scan1.close();

    }

}
