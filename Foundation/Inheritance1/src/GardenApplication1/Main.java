package GardenApplication1;

public class Main {

    public static void main(String[] args) {

        Garden garden = new Garden();


        Flower yellowF = new Flower("yellow");
        Flower blueF = new Flower("blue");
        Tree purpleT = new Tree("purple");
        Tree orangeT = new Tree("orange");


        garden.addPlant(yellowF);
        garden.addPlant(blueF);
        garden.addPlant(purpleT);
        garden.addPlant(orangeT);

        garden.showGarden();

        garden.waterGarden(40);
        garden.waterGarden(70);





    }
}
