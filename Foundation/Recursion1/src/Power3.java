public class Power3 {

    public static void main(String[] args) {

        // Given base and n that are both 1 or more, write a recursive method (no loops)
        // which returns the value of base to the n-th power, so powerN(3, 2) is 9 (3 squared).



        // EXAMPLES RANDOM
        System.out.println(powerN(2, 3));  // Output: 8 (2 cubed)
        System.out.println(powerN(4, 2));  // Output: 16 (4 squared)
        System.out.println(powerN(10, 1)); // Output: 10 (10 to the power of 1)
    }

    public static int powerN(int base, int n) {
        // Base case: if n is 0, return 1 (any number to the power of 0 is 1)
        if (n == 0) {
            return 1;
        } else {
            // Recursive case: multiply the base by the result of powerN with n-1
            return base * powerN(base, n - 1);
        }
    }
}
