import java.util.Scanner;

public class  ScannerPrintBigger5 {
    public static void main(String[] args) {

            // Write a program that asks for two numbers and prints the bigger one.
            // If they are equal, it prints the second one.
            //
            // Example
            //
            // Please enter a number: 5
            // Please enter a number: 13
            // 13

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double number1 = scan1.nextDouble();

        System.out.println("Please enter a number: '");
        double number2 = scan1.nextDouble();

        if (number1>number2) {
            System.out.println(number1 +"A");
        } else if (number2>number1) {
            System.out.println(number2+ "B");
        } else if (number1==number2){
            System.out.println(number2+ "C");

        }






    }
}
