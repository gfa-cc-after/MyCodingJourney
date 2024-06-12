import java.util.Scanner;

public class  ScannerConditionalVariableMutations7 {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        System.out.print("a =");
        int a = scan1.nextInt();

        int output1 =0;

        if (a % 2== 0)
        output1++;
        System.out.println("Output #1 " + output1);



        System.out.println("Please enter an integer between 0 and 30: ");
        System.out.print("b = ");
        int b = scan1.nextInt();

        String output2 = "";

        if (b >=10 && b<=20) {
            System.out.println("sweet");
        } else if (b < 10) {
            System.out.println("less");
        } else if ( b > 20){
            System.out.println("More");
        }


        System.out.println("Output #2: " + output2);
/*
        System.out.println("Please enter an integer between 0 and 100: ");
        System.out.println("credits = ");
        int credits = scan1.nextInt();


*/


    }
}
