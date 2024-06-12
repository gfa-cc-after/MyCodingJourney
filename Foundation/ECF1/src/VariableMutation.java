public class  VariableMutation {
    public static void main(String[] args) {
        // int a = 3;
        //    // increase the value of variable "a" by 10
        //
        int a =3;
        a += 10;
        System.out.println(a);
        //    System.out.println(a);
        //
        //    int b = 100;
        //    // decrease the value of b by 7
        int b = 100;
        b-=7;
        System.out.println(b);

        //    System.out.println(b);


        //    int c = 44;
        //    // double the value of c
        //    System.out.println(c);
        int c =44;
        c *= 2;
        System.out.println(c);



        //    int d = 125;
        //    // divide the value of d by 5
        //
        //    System.out.println(d);
        int d = 125;
        d /= 5;
        System.out.println(d);



        //    int e = 8;
        //    // cube the value of e
        //
        //    System.out.println(e);

        int e = 8;
        e = e*e*e;
        System.out.println(e);



        //    int f1 = 123;
        //    int f2 = 345;
        //    // determine if f1 is greater than f2 (print as a boolean)
        int f1 = 123;
        int f2 = 345;
        System.out.println(f1>f2);


        //    int g1 = 350;
        //    int g2 = 200;
        //    // determine if double the value of g2 is greater
        //    // than g1 (print as a boolean)

        int g1 = 350;
        int g2 = 200;
        System.out.println(g2*2>g1);



        //    int h = 135798745;
        //    // determine if h has 11 as a divisor (print as a boolean)
        int h = 135798745;
        boolean divisible = h % 11 == 0;
        System.out.println(divisible);


        //    int i1 = 10;
        //    int i2 = 3;
        //    // determine if i1 is greater than i2 squared and smaller than i2 cubed
        //    // (print as a boolean)

        int i1 = 10;
        int i2 = 3;

        System.out.println(i1 > (i2*2) && i1 < (i2*i2*i2));


        //
        //    int j = 1521;
        //    // determine if j is divisible by 3 or 5 (print as a boolean)

        int j = 1521;
        boolean div3 = j % 3 == 0;
        boolean div5 = j % 5 == 0;

        System.out.println(div5||div3);

        // OR THIS
        //int j = 1521;
        //
        //        // Determine if j is divisible by 3 or 5
        //        boolean result = j % 3 == 0 || j % 5 == 0;
        //
        //        // Print the result as a boolean
        //        System.out.println(result);


    }
}
