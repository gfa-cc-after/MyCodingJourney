package PetrolStation9;

public class Station {

    int gasAmount;
    static String name;

    public Station(int gasAmount,String name) {
        this.gasAmount = gasAmount;
        this.name = name;
    }

    public void refill(Car anycar) {

        if (gasAmount >= Car.getCapacity()) {
            gasAmount -= Car.getCapacity(); // lowers GAS in car tank

            Car.refill();
            System.out.println(anycar.name + "'s" + " tank is : FULL");
        } else {
            System.out.println(Station.name +" has NOT ENOUGH gas to refill: "+ anycar.name);
        }
    }
}
