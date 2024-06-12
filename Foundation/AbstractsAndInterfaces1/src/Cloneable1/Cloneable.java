package Cloneable1;

public class Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException{

        Student originalJohn = new Student("John",29,"male"," BME");

        Student JohnTheClone = originalJohn.clone();

        JohnTheClone.introduce();

    }
}
