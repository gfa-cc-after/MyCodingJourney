import java.util.Arrays;

public class SwapElements10 {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders` programmatically
        // - Print the swapped array into the console:
        //   [third, second, first]


        System.out.print("[");

        String[] orders = {"first", "second", "third"};

        String temp = orders[0];
        orders[0]= orders[2];
        orders[2]= temp;

        for (int i = 0; i < orders.length ; i++) {
            System.out.print(orders[i]);

            if (i< orders.length -1) {
                System.out.print(", ");
            }



        }
        System.out.print("]");

    }
}
