package CONSTRUCOTorExplainedHERE;

public class Main {
    public static void main(String[] args) {

        //CONSTRUCTOR = special method that is called when an object is instantiated {CREATED}

        Human human = new Human("Rick",65,70);
        Human human2 = new Human("Morty",16,50);

        Elf elf1 = new Elf("mrElf",3000,0);

        elf1.eatChľembas();

        human.eat();
        human2.drinking();
    }
}
