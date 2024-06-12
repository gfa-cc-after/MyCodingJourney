public class RandomInstertTest {
    public static void main(String[] args) {


        String str1 = "123";

        insertAString(str1);



    }

    public static void insertAString (String input) {

        StringBuilder sb1 = new StringBuilder(input);
        sb1.insert(3, " Inserted text");

        System.out.println(sb1.toString());
    }



}
