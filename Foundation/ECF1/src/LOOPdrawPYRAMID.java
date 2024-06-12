import java.util.Scanner;

public class  LOOPdrawPYRAMID {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a pyramid of the specified height
        //
        // Example:
        //
        // Please enter the pyramid height: 4
        //    *
        //   ***
        //  *****
        // *******

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the pyramid height: ");
        int NumberOfStars = scan1.nextInt();

        for (int i = 1; i <= NumberOfStars ; i++) {
            for (int j = 1; j <= NumberOfStars -i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 *i -1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
