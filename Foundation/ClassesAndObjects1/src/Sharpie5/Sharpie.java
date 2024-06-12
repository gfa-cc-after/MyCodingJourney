package Sharpie5;

public class Sharpie {
 //Create a Sharpie class
 //We should know the followings about each sharpie:
 //color (which should be a string),
 //width (which will be a number) and the
 //inkAmount (another number)
 //We need to specify the color and the width at creation
 //Every sharpie is created with a default inkAmount value: 100
 //We can use() the sharpie objects: using it decreases inkAmount by 10
   private String color;
    private double width;
    private double InkAmount;

    public Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
        this.InkAmount = 100;
    }

    public void use() {
        InkAmount -= 10;
    }


    // getters and setters HERE below
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getInkAmount() {
        return InkAmount;
    }

    public void setInkAmount(double inkAmount) {
        InkAmount = inkAmount;
    }

    // getters and setters HERE ABOve

}
