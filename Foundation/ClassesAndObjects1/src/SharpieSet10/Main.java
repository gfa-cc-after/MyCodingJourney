package SharpieSet10;

import Sharpie5.Sharpie;

public class Main {
    public static void main(String[] args) {

        // making shaprieSET object here
        SharpieSet sharpieSet1 = new SharpieSet();

        // some sharpies added to the set/list
        sharpieSet1.add(new Sharpie("Vermillion",0.5));
        sharpieSet1.add(new Sharpie("Azure",0.6));
        sharpieSet1.add(new Sharpie("Alabaster",0.7));
        sharpieSet1.add(new Sharpie("Blood",0.5));
        sharpieSet1.add(new Sharpie("Crimson",0.5));
        sharpieSet1.add(new Sharpie("Blood orange",0.5));

        // testing if sharpies work
        sharpieSet1.listOfSharpies.get(0).use();
        sharpieSet1.listOfSharpies.get(1).use();
        sharpieSet1.listOfSharpies.get(2).use();

        // spam of "Alabaster" sharpie to see if it can be depleted
        // hell yes it can
        sharpieSet1.listOfSharpies.get(3).use();
        sharpieSet1.listOfSharpies.get(3).use();
        sharpieSet1.listOfSharpies.get(3).use();
        sharpieSet1.listOfSharpies.get(3).use();
        sharpieSet1.listOfSharpies.get(3).use();
        sharpieSet1.listOfSharpies.get(3).use();

        // prints umber of USABLE sharpies >> Alabaster was depleted and if i remove
        // one line from code above " sharpieSet1.listOfSharpies.get(3).use(); "  countUsable() prints 4
        // instead of 3 cause "Alabaster" sharpie still HAS INK

        System.out.println("This is number of usable sharpies: "+sharpieSet1.countUsable());

        // RM empty sharpies

        sharpieSet1.removeTrash();

        // shows USABLE sharpies after removing rugs
        System.out.println("Number of usable sharpies after empty were removed: "+sharpieSet1.countUsable());

        // clears the day
        sharpieSet1.listOfSharpies.clear();

        //here are unusable/EMPTY sharpetos

        sharpieSet1.add(new Sharpie("Vermillion",0.5));
        sharpieSet1.add(new Sharpie("Azure",0.6));
        sharpieSet1.add(new Sharpie("Alabaster",0.7));
        sharpieSet1.add(new Sharpie("Blood",0.5));

        // shows number of usable sharpies before removing them
        System.out.println("number of USABLE sharpies (before trash) : "+ sharpieSet1.countUsable()  );


        //remove unusable sharpies to trash

        sharpieSet1.removeTrash();

        // display remaining number fo USABLE sharpies after removing trash
        System.out.println("number of usable sharpies after removing trash: "+sharpieSet1.countUsable());


    }
}
