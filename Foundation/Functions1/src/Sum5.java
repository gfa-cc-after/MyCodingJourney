public class Sum5 {
    public static void main(String[] args) {
        // Create the usual class wrapper (Sum) and main method on your own

        // Write a function called `sum()` that returns the sum of numbers from zero
        // to the given parameter
        //
        // Example: sum(5) = 0 + 1 + 2 + 3 + 4 + 5 = 15

        int n = 5;

        int result = sum(n);

        System.out.println("Sum from 0 to " + n +" is: "+ result);

    }

    public static int sum(int n) {
        int sum =0;
        for (int i = 0; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }
}