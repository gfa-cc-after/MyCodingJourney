package Farm11;

import Animal3.Animal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Farm {

    //Reuse your Animal class
    //Create a Farm class
    //it has a list of Animals listOfAnimals
    //it has a limit that defines how many animals can be kept in the Farm and can be set when the Farm is created
    //it has two methods:
    //breed() -> creates a new animal if there's place for it
    //sell() -> removes the least hungry animal


    List<Animal> listOfAnimals;

    int limit;

    public Farm( int limit) {
        this.listOfAnimals = new ArrayList<>();
        this.limit = limit;
    }

    public void breed(Animal animalrandom){
        if (listOfAnimals.size() < limit){
            listOfAnimals.add(animalrandom);
            System.out.println("New Animal has spawned");
        } else {
            System.out.println("Farm is FULL. There is no space.");
        }
    }

    public void sell() {
        if (!listOfAnimals.isEmpty()) {

            Animal leastHungryAnimal = listOfAnimals.stream().min(Comparator.comparingInt(Animal::getHunger)).orElse(null);

            if (null != leastHungryAnimal) {
                listOfAnimals.remove(leastHungryAnimal);
                System.out.println("Least hungry animal was SOLD");
            }
        }
        if (listOfAnimals.size() == 0) {
            System.out.println("No animals to SELL");

        }

    }
}
