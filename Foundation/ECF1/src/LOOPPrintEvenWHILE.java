public class  LOOPPrintEvenWHILE {
    public static void main(String[] args) {
        // Create a program that prints all even numbers between 0 and 500 (both included)
        // Each number should be on a new line

        int i = -1;
        while (i <= 500) {
            i++;

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
