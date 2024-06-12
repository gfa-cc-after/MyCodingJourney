package Wardrobe4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();

        ClothPiece overwear = new Overwear("Blue", 40);
        ClothPiece underwear = new Underworn("Red", 80);

        wardrobe.addCloth(overwear);
        wardrobe.addCloth(underwear);

        wardrobe.printInfo();

        wardrobe.washAllClothes();
        wardrobe.repairAllClothes();

        ArrayList<String> removedClothes = wardrobe.purge();
        System.out.println("Removed Clothes:");
        for (String cloth : removedClothes) System.out.println(ClothPiece.getInfo());
    }
}
