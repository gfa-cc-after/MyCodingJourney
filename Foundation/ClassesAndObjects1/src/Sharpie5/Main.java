package Sharpie5;

public class Main {
    public static void main(String[] args) {

        Sharpie green = new Sharpie("green",0.5);
        Sharpie blue = new Sharpie("blue",0.6);
        Sharpie teal = new Sharpie("teal",0.4);


        green.use();
        green.use();
        green.use();
        green.use();
        green.use();



        blue.use();
        teal.use();




        System.out.println("Color: "+ green.getColor());
        System.out.println("Width: "+ green.getWidth());
        System.out.println("Ink ammount " + green.getInkAmount());
        System.out.println(" ");
        System.out.println("Color: "+ blue.getColor());
        System.out.println("Width: "+ blue.getWidth());
        System.out.println("Ink ammount " + blue.getInkAmount());
        System.out.println(" ");
        System.out.println("Color: "+ teal.getColor());
        System.out.println("Width: "+ teal.getWidth());
        System.out.println("Ink ammount " + teal.getInkAmount());



    }
}
