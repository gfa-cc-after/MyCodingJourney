public class SumDigit2 {

    public static void main(String[] args) {

        // Given a non-negative integer n, return the sum of its digits recursively
        // (without loops).
        //
        // Hint
        //
        // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
        //
        // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12)



        // RANDOM RANDOM TEST
        System.out.println(sumOfDigits(123));   // Output: 6 (1 + 2 + 3)
        System.out.println(sumOfDigits(4567));  // Output: 22 (4 + 5 + 6 + 7)
        System.out.println(sumOfDigits(98765)); // Output: 35 (9 + 8 + 7 + 6 + 5)
    }

    public static int sumOfDigits(int n) {
        // Base case: if n is less than 10 >>>>>>>> return n (the digit itself)
        if (n < 10) {
            return n;
        } else {
            // Recursive case: add the rightmost digit to the sum of digits for the remaining part
            return n % 10 + sumOfDigits(n / 10);
        }
    }
}
