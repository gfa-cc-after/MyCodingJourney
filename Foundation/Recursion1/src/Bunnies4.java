public class Bunnies4 {

    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears. Write
        // a recursive method (no loops or multiplication) which takes the number of
        // bunnies as its sole parameter and returns the total number of ears
        // the bunnies have. The method should be able to handle invalid input
        // (e.g. negative numbers)



        // TESTT
        System.out.println(countEars(3));   // Output: 6 (3 bunnies with 2 ears )
        System.out.println(countEars(5));   // Output: 10 (5 bunnies with 2 ears )
        System.out.println(countEars(0));   // Output: 0 (0 bunnies)
        System.out.println(countEars(-2));  // Output: 0 (invalid input, return 0)
    }

    public static int countEars(int bunnies) {
        // Base case: if the number of bunnies is less than or equal to 0, return 0
        if (bunnies <= 0) {
            return 0;
        } else {
            // Recursive case: add 2 (ears per bunny) to the result of countEars with bunnies-1
            return 2 + countEars(bunnies - 1);
        }
    }
}
