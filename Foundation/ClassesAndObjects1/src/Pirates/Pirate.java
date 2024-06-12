package Pirates;

import java.util.Random;

public class Pirate    {

     int rumConsumed;
      boolean alive;


    public Pirate() {
        this.rumConsumed = 0;
        this.alive = true;
    }


    public void drinkSomeRum() {
        if (!alive)
            rumConsumed++;
        else
            System.out.println("He's DEAD.");
    }


    public void howItsGoingMate() {
        if (!alive) {
            System.out.println("He's Dead.");
            return;
        }


        if (rumConsumed < 4)
            System.out.println("Pour me annuder!");
        else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            passOut();
        }

    }


    public void passOut() {
        rumConsumed = 0;
    }


     void brawl(Pirate enemy) {
        if (!alive) {
            System.out.println("He is deadddd.");
            return;
        }

        if (enemy.alive) {
            Random random1 = new Random();
            int outcome = random1.nextInt(3);

            switch (outcome) {
                case 0:
                die();
                break;

                case 1:
                    passOut();
                    enemy.passOut();
                    break;
            }
        }

    }

    public void die() {
        alive = false;
    }

}


