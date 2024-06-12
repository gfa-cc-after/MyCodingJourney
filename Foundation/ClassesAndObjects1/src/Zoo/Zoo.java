package Zoo;

public class Zoo {
    public static void main(String[] args) {

        Animal animal1 = new Animal(12, "M", 23);
        animal1.eat();


        Bird bird1 = new Bird(3,"F",30);
        bird1.fly();
        bird1.sleep();

        Fish salmon = new Fish(200,"M",5000);
        salmon.swim();
        salmon.eat();

    }
}
