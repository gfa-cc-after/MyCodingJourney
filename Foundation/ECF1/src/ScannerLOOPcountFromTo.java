import java.util.Scanner;
public class  ScannerLOOPcountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers. If the second number
        // is not greater than the first the program should print:
        // "The second number should be bigger"
        //
        // Otherwise it should output all integers between the first and
        // the second number (excluding the second number)
        // Example:
        //
        // Please enter the first number: 3
        // Please enter the second number: 6
        // 3
        // 4
        // 5

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int int1 = scan1.nextInt();

        System.out.println("Please enter the second number: ");
        int int2 = scan1.nextInt();

        if (int2<=int1) {
            System.out.println("The second number should be bigger");
        } else {
            for (int i = int1; i < int2; i++) {
                System.out.println(i);
            }
        }

    }
}
