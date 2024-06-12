import java.util.Scanner;

public class Random {

    public static void main(String[] args) {


        // THIS CODE ONLY WORKS IF YOU HAVE MONTHLY PAYMENTS DO NOT CALCULATE YOUR BEFORE PAYMENT OR AFTER OR WHATEVER ELSE ->>>> ONLY MONTHLY PAYERS 

        
         // 5218 celkova cena kurzu  a /////
        // 23 pocet tyzdnov b  /////

        // a / b = c

        // c = hodnota 1 tyzdna v eur
        // c x 5 ( pocet tyzdnov )  enter ammount of weeks of course  S1

        // D cena mojej splatka   / enter ammount of paid S2

        // E pocet splatok D   (3 mesiace) //enter number of payments

        // D * E = F

        // F = actually paid ammount (me) 1305

        // G = difference F -

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter YOUR absolved number of weeks in GFA");  //"Zadajte počet týždňov v GFA"
        int scanNumberOfWeeksInCourse = scan1.nextInt();
        System.out.println("Enter amount of your Monthly payments (czk/eur)"); //"Zadajte výšku VAŚEJ splátky"
        double yourMonthlyFee = scan1.nextDouble();
        System.out.println("Enter number of Paid invoices"); //"Zadajte počet zaplatených splátok"
        double numberOfPayments = scan1.nextDouble();

        int numberOfWeeks = 23;
        int numberOfTotalPaymentsSupposed = 12;
        double totalPricePaidByMe = yourMonthlyFee * numberOfPayments;
        double totalPriceofFullCourse = numberOfTotalPaymentsSupposed * yourMonthlyFee;

        System.out.println("TOTAL value of your course (if you have finished paying all monthly payments): " + totalPriceofFullCourse ); //"Celková cena môjho kurzu: "
        System.out.println(" ");
        System.out.println("sum of My payments : " + totalPricePaidByMe); //Moje splátky spolu


        double oneWeekPaymentSupposed = totalPriceofFullCourse / 23;
        System.out.println(" ");
        System.out.println(".......................");
        System.out.println("Value of 1 week: " );  //Hodnota 1 týždňa
        System.out.printf("%f",oneWeekPaymentSupposed);
        System.out.println(" ");
        System.out.println(".......................");


        double valueOfweeksInCourse = oneWeekPaymentSupposed * scanNumberOfWeeksInCourse;
        System.out.println(" ");
        System.out.println("Value of weeks in GFA: " + valueOfweeksInCourse); //hodnota dni v kurze
        System.out.println(" ");
        double overPayment = totalPricePaidByMe - valueOfweeksInCourse;
        System.out.println(" ");

        System.out.println(" ");

        System.out.println(" Overpayment: " + overPayment );





    }
}
