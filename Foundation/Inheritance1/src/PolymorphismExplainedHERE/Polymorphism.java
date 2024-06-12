package PolymorphismExplainedHERE;


// Polymorphism >>> vtak aj crow kvikaju rovnako but crow is
// subclass of Bird a preto crow sing is prioritized kraaaa kraaa

public class Polymorphism {
    public static void main(String[] args) {

        Bird b = new Bird();
        b.sing();

        Crow c = new Crow();
        c.sing();
    }
}
