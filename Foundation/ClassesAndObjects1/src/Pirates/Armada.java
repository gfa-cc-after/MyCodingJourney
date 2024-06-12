package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {


    List<Ship> ships;



   public Armada () {
        this.ships = new ArrayList<>();
    }


    void add(Ship ship) {
        ships.add(ship);
    }

    boolean war(Armada enemyArmada) {
       int thisIndex = 0;
       int otherIndex =0;
        while (thisIndex < this.ships.size() && otherIndex < enemyArmada.ships.size()) {
            Ship thisShip = this.ships.get(thisIndex);
            Ship otherShip = enemyArmada.ships.get(otherIndex);

            if (thisShip.battle(otherShip)) {
                otherIndex++;
            } else {
                thisIndex++;
            }
        }

        return thisIndex >= this.ships.size();
    }




}
