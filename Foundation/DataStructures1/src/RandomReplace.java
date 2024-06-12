public class RandomReplace {
    public static void main(String[] args) {

        String str1 = "123";


        randomReplace(str1);

    }

    public static void randomReplace (String input) {

        StringBuilder sb1 = new StringBuilder(input);
        sb1.insert(3,"InsertedText");
        System.out.println(sb1.toString());

        sb1.replace(3,15,"Replaced");

        System.out.println(sb1.toString());


    }
}
