package Animal3;

public class AnimalMain {
    public static void main(String[] args) {

        Animal Animal1 = new Animal();
        Animal1.eat(); // hunger to 49
        Animal1.drink(); // thirst to 49
        Animal1.play(); // brings back both to 50 ? hopefully


        SeaHorse SeahorseBlue = new SeaHorse(50,50);
        SeahorseBlue.swimming();
    }


}
