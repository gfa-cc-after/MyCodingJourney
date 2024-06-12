package SharpieSet10;

import Sharpie5.Sharpie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SharpieSet {

    //Reuse your Sharpie class
    //Create SharpieSet class
    //it contains a list of Sharpie, named listOfSharpies
    //it has a method that adds a new Sharpie to the set: add(sharpie)
    //it has a method that returns the number of usable Sharpies: countUsable() -> sharpie is usable if it contains ink
    //it has a method that removes all unusable Sharpies: removeTrash()
    //Test your class by adding usable and unusable sharpies, then call the removeTrash() function
    //Test your class also by having 3 unusable sharpies only, then call the removeTrash() function

    List<Sharpie> listOfSharpies;

    // Constructor this below
    public SharpieSet() {
        this.listOfSharpies = new ArrayList<>();
    }


    // this adds new Sharpie to my list
    public void add(Sharpie sharpie) {
        listOfSharpies.add(sharpie);
    }


    // this here return number of USED sharpies
    public int countUsable() {
        int counter = 0;
        for (Sharpie sharipe : listOfSharpies) {

            if (sharipe.getInkAmount() > 0 ) {
                counter++;
            }
        }
        return counter;
    }


  // removing all unusable sharpies with 0 amount

    public void removeTrash() {
        Iterator<Sharpie> iterator1 = listOfSharpies.iterator();
        while (iterator1.hasNext()) {
            Sharpie sharpie = iterator1.next();

            if (sharpie.getInkAmount() <= 0) {
                iterator1.remove();
            }
        }

    }


}
