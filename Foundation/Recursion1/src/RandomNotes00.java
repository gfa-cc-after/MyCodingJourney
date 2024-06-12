public class RandomNotes00 {

    public static void main(String[] args) {


    }

    // Chocolate 1
    // Chocolate 1/2 1/2
    // Chocolate 1/4 1/4 1/4 1/4

   /* public static void printChoco (double current) {
        System.out.println("Current: " + current);

        if (current <0.0000006) {
            return;
        }

        printChoco(current/2);
        printChoco(current/2);





    }
*/

    public static long fibonacci(int input) {
        // base case
        if (input == 0) {
            return 0;
        } else if (input ==1) {
            return 1;
        }
        long result = fibonacci(input-1) + fibonacci(input-2);
        return result;
    }


}
