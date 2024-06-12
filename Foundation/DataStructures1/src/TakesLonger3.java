public class TakesLonger3 {
    public static void main(String[] args) {


        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!


        // 1  here we create STRINGBUILDER with initial values
        StringBuilder String1 = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");

        // 2  Identify specific location where you want to insert where I INSERT TEXT

        int insertionIndex = 20;

        // 3 here I use TEXT I WANNA INSERT

        String textToInsert = " always takes longer than";

        String1.insert(insertionIndex,textToInsert);

        System.out.println("new: " + String1.toString());

    }
}