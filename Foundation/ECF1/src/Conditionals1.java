public class Conditionals1 {
    public static void main(String[] args) {

        int a = 13;

        if (a == 13) {
            System.out.println("Yaaay! The value of the \"a\" variable is 13");
        }

        if (a == 8) {
            System.out.println("Yaaay! The value of the \"a\" variable is 8");


            int b = 20;

            if (b < 10) {
                System.out.println("Yaay! The value of b \"b\" variable is lower than 10");
            } else {
                System.out.println("Yaaay! The value of the \"b\" variable is higher 10");
            }


            int c = 15;

            if (c < 10) {
                System.out.println("Yaaay! The value of the \"c\" variable is lower than 10");
            } else if (c < 20) {
                System.out.println("Yaaay! The value of the \"c\" variable is higher than 10");
            } else {
                System.out.println("Yaaay! The value of the \"c\" variable is higher than 10");
            }


            boolean thirsty = true;
            boolean hungry = false;

            if (thirsty && hungry) {
                System.out.println("Lunch time!");
            } else if (thirsty || hungry) {
                System.out.println("Snack time!");
            } else {
                System.out.println("No food for you ");
            }


        }
    }
}