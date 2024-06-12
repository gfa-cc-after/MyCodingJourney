import java.util.Scanner;

public class  ScannerConditionalOddEven {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even
        //
        // Please enter a number: 7
        // Odd


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        double number = scan1.nextDouble();


        if (number % 2 ==0) {
            System.out.println("Number "+number + " is Even");
        } else {
            System.out.println("Number "+number + " is Odd");
        }

    }
}


//if (thirsty && hungry ) {
//            System.out.println("Lunch time!");
//        } else if (thirsty || hungry ) {
//            System.out.println("Snack time!");
//        } else {
//            System.out.println("No food for you ");
//        }