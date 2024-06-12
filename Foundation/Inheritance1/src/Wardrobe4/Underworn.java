package Wardrobe4;

class Underworn extends ClothPiece {
    public Underworn(String color, int condition) {
        super("Underwear", color, condition);
    }


    public boolean needsToBeRepaired() {
        // Underwear cannot be repaired
        return false;
    }
}