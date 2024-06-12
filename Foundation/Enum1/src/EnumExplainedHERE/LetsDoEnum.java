package EnumExplainedHERE;
// ENUM is as if a class and array had a baby
// List of values that DOES NOT CHANGE but its setup like a CLASS

public class LetsDoEnum {

    public static void main(String[] args) {

        levels l = levels.LOW;


        switch(l) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

    }
}
