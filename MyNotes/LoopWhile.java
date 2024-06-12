public class LoopWhile {
    public static void main(String[] args) {

//While Loops
//while loops look similar to if-statements. They need a condition to decide when to stop executing their block of code:

//      int number = 5;
//      while (number % 2 != 0) {
//      System.out.println("The nmumber is odd");
//      number++;
//         }

//When the program reaches the while loop, it checks if the condition is true.
// Since the remainder of 5 divided by 2 is not 0 (it's 1), the code inside the curly braces is executed.
// Now, instead of moving on to code below, the program goes back to the top and checks the condition again.
// Now number is 6, and the remainder of 6 divided by 2 is 0, so now the condition is false.
// Once it is false, the block is skipped and the program continues to the next lines of code.


 // EXERCISE
//Change the value of number in the code below so that the loop will execute exactly 10 times.
// Run it to check if you're correct.

    //int number = 0;
    int number = 19;

    while (number >= 10) {
        System.out.println("The number is " + number);
        number--;
    }


    }
}
