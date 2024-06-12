package Pirates;

public class Pirates {
    public static void main(String[] args) {
        // Create ships
        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        ship1.fillShip();
        ship2.fillShip();

        // Print initial ship states
        System.out.println("Ship 1:");
        ship1.printShipState();
        System.out.println("Ship 2:");
        ship2.printShipState();

        // Have a battle!
        ship1.battle(ship2);

        // Print final ship states after battle
        System.out.println("Ship 1 after battle:");
        ship1.printShipState();
        System.out.println("Ship 2 after battle:");
        ship2.printShipState();
    }
}
