package PetrolStation9;

public class Main {
    public static void main(String[] args) {

        //Create Station and Car classes
        //Station
        //it stores how much gas is available: gasAmount
        //the gas amount must be given when we create a station
        //it can refill a car: refill(car):
        //decreases the gasAmount by the capacity of the car (let us suppose that the car is empty) and
        //increases the car's gasAmount
        //Car
        //it stores how much gas is actually present: gasAmount
        //it stores the capacity of the tank: capacity
        //create a constructor for the Car class where you:
        //initialize gasAmount -> 0
        //initialize capacity -> 100

        Station gasBase1 = new Station(200, "Gas Base 52");

        Car carmagedonRED  = new Car("CarmagedonRED");
        Car carGodzilla  = new Car("CarGodzilla");
        Car carSAW  = new Car("carSAW");



        gasBase1.refill(carmagedonRED);
        gasBase1.refill(carGodzilla);
        gasBase1.refill(carSAW);

        System.out.println(" ");

        System.out.println(carmagedonRED.name + "'s tank IS: " + carmagedonRED.getGasAmount()+ "%");
        System.out.println(carGodzilla.name + "'s tank IS: " + carGodzilla.getGasAmount()+ "%");
        System.out.println(carSAW.name + "'s tank IS: " + carSAW.getGasAmount()+ "%");

    }
}
