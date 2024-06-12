package Wardrobe4;


class ClothPiece {
    private static String type;
    private static String color;
    private static int condition;
    private static int daysWorn;

    public ClothPiece(String type, String color, int condition) {
        this.type = type;
        this.color = color;
        this.condition = condition;
        this.daysWorn = 0;
    }

    public boolean needsToBeWashed() {
        return daysWorn >= getWashDaysThreshold();
    }

    public boolean needsToBeRepaired() {
        return type.equals("Overwear") && condition >= 1 && condition <= 5;
    }

    public void wear() {
        if (needsToBeWashed()) {
            throw new IllegalStateException("Cloth needs to be washed before wearing again.");
        }
        daysWorn++;
    }

    public void wash() {
        daysWorn = 0;
        condition = Math.max(0, condition - 1);
    }

    public void repair() {
        if (!type.equals("Underwear")) {
            condition = getInitialCondition();
        }
    }

    public static String getInfo() {
        return String.format("%s %s worn for %d days, has %d wash cycles left",
                color, type.toLowerCase(), daysWorn, getWashCyclesLeft());
    }

    protected int getWashDaysThreshold() {
        return type.equals("Overwear") ? 5 : 1;
    }

    protected static int getInitialCondition() {
        return type.equals("Overwear") ? 50 : 100;
    }

    protected static int getWashCyclesLeft() {
        return Math.max(0, getInitialCondition() - condition);
    }
}