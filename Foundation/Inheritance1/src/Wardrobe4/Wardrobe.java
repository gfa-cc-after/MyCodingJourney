package Wardrobe4;

import java.util.ArrayList;

class Wardrobe {
    private ArrayList<ClothPiece> clothes;

    public Wardrobe() {
        this.clothes = new ArrayList<>();
    }

    public void addCloth(ClothPiece cloth) {
        clothes.add(cloth);
    }

    public void printInfo() {
        for (ClothPiece cloth : clothes) {
            System.out.println(cloth.getInfo());
        }
    }

    public void washAllClothes() {
        for (ClothPiece cloth : clothes) {
            if (cloth.needsToBeWashed()) {
                cloth.wash();
            }
        }
    }

    public void repairAllClothes() {
        for (ClothPiece cloth : clothes) {
            if (cloth.needsToBeRepaired()) {
                cloth.repair();
            }
        }
    }

    public ArrayList<String> purge() {
        ArrayList<String> removedClothes = new ArrayList<>();
        clothes.removeIf(cloth -> {
            if (cloth.getInitialCondition() == 0) {
                removedClothes.add(String.valueOf(cloth));
                return true;
            }
            return false;
        });
        return removedClothes;
    }
}