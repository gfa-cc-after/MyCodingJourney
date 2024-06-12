package Rectangle;

import Rectangle.Rectangle;

public class RectangleHere {
    public static void main(String[] args) {


        Rectangle rectangle1 = new Rectangle();
        rectangle1.a = 3;
        rectangle1 .b = 4;

      //  add(3,4);
        System.out.println("Perimeter " + rectangle1.perimeter());
        System.out.println("Area " + rectangle1.area());
    }
}
