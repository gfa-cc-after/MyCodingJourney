import java.util.Scanner;

public class  ScannerUserInput {
    public static void main(String[] args) {

        // this creates scanner (also imports java.until.Scanner; on top
          Scanner input = new Scanner(System.in);

          System.out.println("please enter ur favorite number");
          int favoriteNumber = input.nextInt();


          System.out.println("your favorite number is: " + favoriteNumber);




        Scanner scanner1 = new Scanner(System.in);

        System.out.println("enter your username");

        String userName = scanner1.nextLine();

        System.out.println("Hello mr "+userName);


        System.out.println("Welcome mr "+ userName + " your favorite number is: " + favoriteNumber);
    }
}
