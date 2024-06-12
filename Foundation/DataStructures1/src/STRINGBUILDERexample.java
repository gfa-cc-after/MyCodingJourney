import javax.print.DocFlavor;

public class STRINGBUILDERexample {

    public static void main(String[] args) {


        String s1 = "Duck";

        buildAString(s1);

    }

    public static void buildAString (String input) {

        //      this is same as SCANNER
        // watch
        //
        //           Scanner scan1 = new Scanner(System.in);
        //           int sum = 0;     // sout ("DACO"

        StringBuilder sb1 = new StringBuilder(input);
        sb1.append("222251");
        System.out.println(sb1.toString());


    }


}
