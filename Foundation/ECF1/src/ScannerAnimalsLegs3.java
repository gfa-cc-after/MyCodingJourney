import java.util.Scanner;

public class ScannerAnimalsLegs3 {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // Print how many legs all the animals have in total
        //
        // Example
        //
        // Please enter the number of chickens: 4
        // Please enter the number of pigs: 2
        // The number of legs: 16

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the number of chickens HERE: ");
        int numberOfChicken = scan1.nextInt();

        int chickenlegsTotal = numberOfChicken *2 ;

      //  System.out.println("number of chicken legs is : " + chickenlegsTotal);


        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter the number of pigs HERE");
        int numberOfPigs = scan2.nextInt();

        int pigsLegsTotal = numberOfPigs * 4;

        int AllLegsTotal = chickenlegsTotal + pigsLegsTotal;

        System.out.println("Number of legs: " + AllLegsTotal );






    }
}
