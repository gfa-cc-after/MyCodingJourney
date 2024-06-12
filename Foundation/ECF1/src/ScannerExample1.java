import java.util.Scanner;

public class  ScannerExample1 {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Hello there, what is your first name?");
        String firstName = scan1.next();

        System.out.println("Whats your age<??");
        int yourAge = scan1.nextInt();

        System.out.println("Whats your senior quote?");
        String quote = scan1.next();
        quote = scan1.nextLine();

        System.out.println("Hello mr "+ firstName+ "Your age is " + yourAge);
        System.out.println("Your senior quote is: " + quote);
    }
}
