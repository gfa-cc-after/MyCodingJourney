public class NumberAdder1 {
    public static void main(String[] args) {
        // Implement "numberAdder" which is a recursive function that takes one parameter: n (number)
        // and returns the sum of integers from 1 to n.
        // The function should return 0 for inputs less than 1.


        System.out.println(numberAdder(10));
        System.out.println(numberAdder(100));
    }

    public static int numberAdder(int n) {
        // Base case HERE : if n is less than 1 return 0
        if (n < 1) {
            return 0;
        } else {
            // Recursive case: add n to the sum of integers from 1 to n-1
            return n + numberAdder(n - 1);
        }
    }

}

