public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders` programmatically
        // - Print the swapped array into the console:
        //   [third, second, first]

        String[] orders = {"first", "second", "third"};

        String temp = orders[1];
        orders[1]=orders[2];
        orders[2]=temp;


        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }


    }
}
