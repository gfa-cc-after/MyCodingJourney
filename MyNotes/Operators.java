public class Operators {
    public static void main(String args[]) {

        //Create a double variable called number and assign it a value of 16.
        //Decrement number by 1.
        //Divide number by 5.
        //Add 7 to number.
        //Multiply number by 2.5.
        //Print to the terminal the remainder value of number when dividing by 8. (Hint: use the modulus operator!)


        double number = 16;
        number--;
        number /= 5;
        number += 7;
        number *= 2.5;

        double remainder = number % 8;
        System.out.println(remainder);


        //Create two int variables called number1 and number2 and set them both to 11.
        // Write these questions and statements in Java code and print the return values to the terminal.
        //
        //Is number1 equal to number2?
        //number2 greater than or equal to number1.
        //Is number1 less than 5?
        //number2 not equal to 11.

        int number1 = 11;
        int number2 = 11;


        System.out.println(number1 == number2);
        System.out.println(number2 >= number1);
        System.out.println(number1 < 5);
        System.out.println(number2 != 11);


        System.out.println( "BREAK BREAK BREAK");
        //x is not equal to 14.
        //y is greater than 4 and y is less than or equal to 40.
        //not (4 is less than 10 or 16 is equal to 17).
        //y is less than 15 or y is greater than or equal to 31.
        //x is equal to 14 or y is equal to 10.
        //Expected Output
        //false
        //true
        //false
        //true
        //true

        int x = 14;
        int y = 10;

        System.out.println(x != 14);
        System.out.println(y>5 && y<=40);
        System.out.println(!(4<10 || y>=17));
        System.out.println(y<15 || y>=31);
        System.out.println(x==14 || y==10);














    }
}