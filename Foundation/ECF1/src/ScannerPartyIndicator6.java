import java.util.Scanner;

public class  ScannerPartyIndicator6 {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party,
        // the second represents the number of boys
        //
        // If the number of girls and boys are equal and 20 or more people are
        // coming to the party, it should print: The party is excellent!
        //
        // If there are 20 or more people coming to the party but the girl - boy
        // ratio is not 1-1, it should print: Quite a cool party!
        //
        // If there are fewer than 20 people coming,
        // it should print: Average party...
        //
        // If no girls are coming, regardless the count of the people,
        // it should print: Sausage party
        //
        // Please enter the number of girls: 15
        // Please enter the number of boys: 25
        // Quite a cool party!

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the number of girls");
        int numberOfGirls = scan1.nextInt();

        System.out.println("Enter the number of boys");
        int numberOfBoys = scan1.nextInt();

        int numberOfPeople = numberOfGirls + numberOfBoys;

        if (numberOfGirls == 0 && numberOfPeople > 0) {
            System.out.println("Sausage party");
        } else if (numberOfPeople >= 20) {
            if (numberOfGirls == numberOfBoys) {
                System.out.println("The party is excellent!");
            } else {
                System.out.println("Quite a cool party!");
            }
        } else {
            System.out.println("Average party...");
        }













      /*  if (numberOfBoys == numberOfGirls && numberOfGirls >= 20) {
            System.out.println("The party is excellent!");
        } else if (numberOfPeople >= 20 && numberOfGirls<numberOfBoys) {
            System.out.println("Quite a cool party!");
        } else if (numberOfPeople<20) {
            System.out.println("Average party...");
        } else if (numberOfGirls == 0) {
            System.out.println("Sausage party");
        }

*/








    }
}
