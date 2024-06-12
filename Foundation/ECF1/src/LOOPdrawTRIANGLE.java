import java.util.Scanner;

public class  LOOPdrawTRIANGLE {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a triangle of the specified height
        //
        // Example:
        //
        // Please enter the triangle height: 4
        // *
        // **
        // ***
        // ****

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the triangle height: ");
        int numberOfStars = scan1.nextInt();

        for (int i = 1; i <= numberOfStars ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

