package Animal3;

public class Animal {

    int hunger;
    int thirst;

    public Animal(){

        this.hunger=50;
        this.thirst=50;

    }

    public void eat() {
        if (hunger > 0) {
            System.out.println("Eating... nom..nom..nomm....Tasty");
        }
    }

    public void drink(){
        if (thirst > 0){
            hunger--;
        }
        System.out.println("..Drinking....gulp.....glop.");
    }

    public void play(){
        hunger++;
        thirst++;
        System.out.println("Leeroooooooooooooyyy..Jenkins");
    }


    public int getHunger() {
        return hunger;
    }


}
