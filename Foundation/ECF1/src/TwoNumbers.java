public class  TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13
        // Print the result of 13 added to 22
        // Print the result of 13 substracted from 22
        // Print the result of 22 multiplied by 13
        // Print the result of 22 divided by 13 (as a decimal fraction)
        // Print the integer part of 22 divided by 13
        // Print the remainder of 22 divided by 13


        int num1 = 22;
        int num2 = 13;
        System.out.println("result of adding: "+ (num1+num2));
        System.out.println("result of substraction: "+ (num1-num2));
        System.out.println("multiplication: " + num1*num2);
        System.out.println("divided as decimal fraction: " + (double) num1/num2);
        System.out.println("Integer part of 22 divided by 13: " + num1/num2);
        System.out.println("Remainder of 22 divided by 13 : " +num1%num2);

    }
}
