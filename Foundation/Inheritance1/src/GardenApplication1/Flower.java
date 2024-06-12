package GardenApplication1;

 public class Flower extends Plant {
     public Flower(String color) {
         super(color);
     }


     public boolean needsWater() {
         return waterAmount < 5;
     }


     public  void waterAbsorbed (double amount){
         waterAmount += amount * 0.75;
     }
 }
