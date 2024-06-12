public class Factorial6 {
    public static void main(String[] args) {
        // EXAMPLEEE
        int number = 9;
        long factorialResult = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            // Factorial is not defined for negative numbers
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
