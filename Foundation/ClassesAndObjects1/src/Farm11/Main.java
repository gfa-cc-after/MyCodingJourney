package Farm11;

import Animal3.NonSeaHorse;
import Animal3.SeaHorse;

public class Main {
    public static void main(String[] args) {


        // limit of max animals
        Farm farm1 = new Farm(5);


        farm1.breed(new SeaHorse(20,20));
        farm1.breed(new NonSeaHorse(20,20));
        farm1.breed(new SeaHorse(20,20));
        farm1.breed(new SeaHorse(20,20));
        farm1.breed(new SeaHorse(20,20));
        farm1.breed(new SeaHorse(20,20));

        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();
        farm1.sell();



    }
}
