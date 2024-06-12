import java.util.ArrayList;

public class PersonalFinance1 {
    public static void main(String[] args) {
    //Create a list with the following items:
    //500, 1000, 1250, 175, 800 and 120
    //Create an application which prints out the answers to the following questions:
    //How much did we spend?
    //Which was our greatest expense?
    //Which was our cheapest spending?
    //What was the average amount of our spendings? (print this as a float value)
    //The full output of your main method should be the following:
    //
    //3845
    //1250
    //120
    //640.8333

        ArrayList<Integer> pFlist = new ArrayList<>();
        pFlist.add(500);
        pFlist.add(1000);
        pFlist.add(1250);
        pFlist.add(175);
        pFlist.add(800);
        pFlist.add(120);

        //How much did we spend? SUM FOR LOOP
        int sum = 0;
        for (int value : pFlist) {
            sum += value;
        }

        System.out.println(sum);

        //Which was our greatest expense?

        int highestExpense = pFlist.stream().max(Integer::compare).orElse(0);
        System.out.println(highestExpense);

        //Which was our cheapest spending?

        int lowestExpense = pFlist.stream().min(Integer::compare).orElse(0);
        System.out.println(lowestExpense);

        //What was the average amount of our spendings? (print this as a float value)
        double averageExpense = pFlist.stream().mapToInt(Integer::intValue).average().orElse(0.0);

            // FLOAT "%.2f\n" ,  NOT + + ++ ++ +++++ !!!
        System.out.printf("%.2f\n" , averageExpense);


    }
}
