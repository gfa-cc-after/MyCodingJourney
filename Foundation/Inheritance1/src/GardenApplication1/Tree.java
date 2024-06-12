package GardenApplication1;

public class Tree extends Plant {
    public Tree(String color) {
        super(color);
    }


    public boolean needsWater() {
        return waterAmount < 10;
    }

    public void waterAbsorbed(double amount) {

        waterAmount += amount *0.40;
    }

}
