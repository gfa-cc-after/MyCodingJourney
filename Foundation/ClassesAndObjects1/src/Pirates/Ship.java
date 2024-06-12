package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

    List<Pirate> crew;
    Pirate captainJack;


    public Ship() {
        this.crew = new ArrayList<>();
        this.captainJack = captainJack;
    }

 // filling up the ship with random number of piratos ( capped at 113) and 1 captain
    void fillShip() {
        Random random2 = new Random();
        int numberOfPirates = random2.nextInt(113);
        for (int i = 0; i < numberOfPirates; i++) {
            crew.add(new Pirate());
        }
        captainJack = new Pirate();
    }


    int calculateScore() {
        int alivePirates = 0;

        for( Pirate pirate: crew) {
            if (pirate.alive)   {
                alivePirates++;
            }
        }
        return alivePirates - captainJack.rumConsumed;
}


    boolean battle(Ship enemyShip) {
        int score0 = this.calculateScore();
        int score1 = enemyShip.calculateScore();

        if (score0 >= score1) {
            celebrateWIN(this);
            enemyShip.sufferDefeat();
            return true;
        } else {
            celebrateWIN(this);
            this.sufferDefeat();
            return false;
        }
    }

    private void celebrateWIN(Ship ship) {
        Random rand = new Random();
        for (Pirate pirate : ship.crew) {
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
            pirate.drinkSomeRum();
        }
    }


    private void sufferDefeat() {
        Random random3 = new Random();
        int numLosses = random3.nextInt(crew.size());
        for (int i = 0; i < numLosses; i++) {
            int pirateIndex = random3.nextInt(crew.size());
            crew.get(pirateIndex).die();
        }
    }

    void printShipState() {
        System.out.println("Captain's rum consumption: " + captainJack.rumConsumed);
        int alivePirates = 0;
        for (Pirate pirate : crew) {
            if (pirate.alive) {
                alivePirates++;
            }
        }
        System.out.println("Number of alive pirates in the crew: " + alivePirates);
    }





}
