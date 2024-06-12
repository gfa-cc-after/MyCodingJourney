import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        // Create a `divide10By` function that divides number 10 (integer)
        // by an integer number that's passed as a parameter and prints the result.
        // The result of the division should be an integer as well (not a floating point number).
        // It should print "fail" if the parameter is 0

       Scanner scan1 = new Scanner(System.in);
       int divisor = scan1.nextInt();

    try {
        int result = 10 / divide10by(divisor);
        System.out.println(result);
    } catch (ArithmeticException e) {
        System.out.println("fail");
    }

    }

    public static int divide10by  (int input) {
        return input ;

    }
}
