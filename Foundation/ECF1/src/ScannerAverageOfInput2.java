import java.util.Scanner;

public class  ScannerAverageOfInput2 {
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

        /// UNNESECERALY HARD SOLUTION

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int int1 = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int int2 = scan2.nextInt();

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int int3 = scan3.nextInt();

        Scanner scan4 = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int int4 = scan4.nextInt();

        Scanner scan5 = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int int5 = scan5.nextInt();

        int sum = int1 + int2 + int3 + int4 + int5;
        float avg = (float) sum / 5;

        System.out.println("Sum: " + sum + " Average: " +avg);




    }
}
