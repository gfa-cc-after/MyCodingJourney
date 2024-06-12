package EnumExplainedHERE1;

public class LetsDoEnum1 {
    public static void main(String[] args) {

        Flavors flav = Flavors.VANILLA;



        if (flav == flav.VANILLA) {
            System.out.println("Its vanilla");
        } else if (flav == flav.CHOCOLATE) {
            System.out.println("Its chocolate");
        } else if (flav == flav.STRAWBERRY) {
            System.out.println("Its Strawberry");
        }


    }
}
