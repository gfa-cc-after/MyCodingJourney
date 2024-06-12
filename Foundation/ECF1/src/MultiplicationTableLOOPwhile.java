import java.util.Scanner;

public class  MultiplicationTableLOOPwhile {
    public static void main(String[] args) {
        // Create a program which prints the multiplication table for a specified number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45
        // 4 * 15 = 60
        // 5 * 15 = 75
        // 6 * 15 = 90
        // 7 * 15 = 105
        // 8 * 15 = 120
        // 9 * 15 = 135
        // 10 * 15 = 150


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the number");
        int int1 = scan1.nextInt();

        int i = 0;
        while (i < 10) {
            i++;

            System.out.println(i + " * " + int1 + " = " + (int1 * i));
        }


    }
}
