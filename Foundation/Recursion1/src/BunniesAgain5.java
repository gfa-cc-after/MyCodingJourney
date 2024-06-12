public class BunniesAgain5 {
    public static void main(String[] args) {
        // We have bunnies standing in a line numbered as 1, 2, ... The "odd" bunnies
        // (1, 3, ...) have the usual number of ears = 2. However, the even bunnies
        // (2, 4, ...) have 3 ears each (because they have a raised foot). Write
        // a recursive method which accepts the number of bunnies as a parameter
        // and returns the total number of "ears" in the bunny line. The method should be
        // able to handle invalid input (e.g. negative numbers).


        // TESTS
        System.out.println(countEars(3));   // Output: 5 (2 ears for bu nny 1 + 3 ears for bunny 2)
        System.out.println(countEars(5));   // Output: 8 ( 2 + 3 + 2 +  3 + 2)
        System.out.println(countEars(0));   // Output: 0 (0 bunnies)
        System.out.println(countEars(-2));  // Output: 0 (invalid input , return 0)

    }

    public static int countEars(int bunnies) {
        // BASECASE : if the number of bunnies is less than or equal to 0, return 0
        if (bunnies <= 0) {
            return 0;
        } else {
            // Recursive case: if the bunny is odd, add 2 ears; if even, add 3 ears
            if (bunnies % 2 == 1) {
                // Odd bunnz
                return 2 + countEars(bunnies - 1);
            } else {
                // Even bunny
                return 3 + countEars(bunnies - 1);
            }
        }
    }


}
