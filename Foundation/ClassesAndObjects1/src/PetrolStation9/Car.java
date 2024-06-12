package PetrolStation9;

public class Car {

    static int gasAmount;
    static int capacity;

     String name;



    public Car(String name) {
        this.name = name;
        this.gasAmount = 0;
        this.capacity = 100;
    }

    public static void refill() {
        gasAmount = capacity;
    }

    public int getGasAmount() {
        return gasAmount;
    }

    public void setGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public static int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
