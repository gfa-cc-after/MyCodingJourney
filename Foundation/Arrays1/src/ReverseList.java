public class ReverseList {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements of `numbers` programmatically
        // - Print the elements of the reversed `numbers`:
        //   [7, 6, 5, 4, 3]

        int[] numbers = {3, 4, 5, 6, 7};
        System.out.print("[ ");
        for (int i = 4; i > -1 ; i--) {
            System.out.print(numbers[i]);

            if (i< numbers.length -1) {
                System.out.print(", ");
            }


        }
        System.out.println("]");

    }
}
