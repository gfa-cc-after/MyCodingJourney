import java.util.Scanner;

public class  ScannerAverageOfInput3 {
    public static void main(String[] args) {

        // Write a program prompts the user for 5 integers in a row,
        // then it prints their sum and their average:
        //
        // Please enter a number: 3
        // Please enter a number: 7
        // Please enter a number: 1
        // Please enter a number: 6
        // Please enter a number: 5
        // Sum: 22, Average: 4.4

        // SHORTEST SMARTEST SOLUTION

        Scanner scan1 = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("plese enter a number: ");
        int number = scan1.nextInt();
        sum += number;

        }

        float average = (float) sum /5;
        System.out.println("Sum: " + sum + " Average: " + average);

        scan1.close();

    }
}
