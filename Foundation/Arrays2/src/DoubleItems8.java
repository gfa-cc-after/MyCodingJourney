public class DoubleItems8 {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array and print the modified
        //   array to the console as:
        //   [6, 8, 10, 12, 14]

        System.out.print("[");

        int[] numbers = {3, 4, 5, 6, 7};

        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i]*2);

            // toto je koli ciarke  ak tam nedas if a toto pod
            // consola bude [6, 8, 10, 12, 14,] namiesto [6, 8, 10, 12, 14]
            if (i < numbers.length -1) {
                System.out.print(", ");
            }
        }

        System.out.print("]");


    }
}
