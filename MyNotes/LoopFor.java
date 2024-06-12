public class LoopFor {
    public static void main(String[] args) {
//For Loops
//for loops require a little more set-up than while loops, but they are an incredibly useful and
// powerful tool to have in your coding skill set. A typical for loop looks something like this:
//
//          for (int i = 0; i < 6; i++) {
//          // your code here
//            }


//Each for loop has 3 key statements inside the parentheses ( ):
//
// 1 The first statement usually contains the declaration of the variable that keeps track of how many times the block
// 1 will be executed (in the example above it is int i = 0.) This code executes exactly once at the beginning.
// 1 It is standard in many programming languages to call this counting variable i.

//2 The second statement contains the condition (in the example above it is i < 6). Just like if-statements
//2 and while loops, the for loop block will only execute if the condition is true. And just like while loops, it is
//2 checked at the beginning of each iteration and if it is false, the program stopped executing the loop and moves on.

//3 The third and final statement is code that is executed at the end of every iteration. Usually (but not always)
//3 it increments the counting variable i (as it does in the example, i++).

    //EXERCISE
        //Declare a counting variable of type int called i. The starting value is 1.
        //Write a condition that means, "i is less than or equal to 8."
        //At the end of every iteration, increment the value of i by 1;
        //Your code should print the value of i to the terminal during each iteration
        // (hint: write it inside the for loop's block, between the curly braces { }).


        for (int i = 1; i < 8; i++) {
            System.out.println(i);

        }




    }
}
