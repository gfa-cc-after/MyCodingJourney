package FleetOfThings6;

public class FleetOfThings {
    public static void main(String[] args) {
        // // - You have the `Thing` class
        //    // - You have the `Fleet` class
        //    // - You have the `FleetOfThings` class with a `main()` method
        //    // - Download those, use those
        //    // - Create a fleet in the main() method
        //
        //    // - Create a fleet of things to have this output:
        //    // 1. [ ] Get milk
        //    // 2. [ ] Remove the obstacles
        //    // 3. [x] Stand up
        //    // 4. [x] Eat lunch

        Thing thing1 = new Thing("Get milk");
        Thing thing2 = new Thing("Remove the obstacles");
        Thing thing3 = new Thing("Stand up");
        Thing thing4 = new Thing("Eat Lembas ");



        thing3.complete();
        thing4.complete();




        System.out.println(thing1);
        System.out.println(thing2);
        System.out.println(thing3);
        System.out.println(thing4);




    }
}
