package FargodeepMineExample;

public class Kobold extends Npc{

    public Kobold(int lvl, String weapon, int xpGain, String name) {
        super(lvl, weapon, xpGain, name);
    }

    public void mining(){
        System.out.println(" Mining copper rrrrrr...");
    }

    public void Talk() {
        System.out.println(this.name + " You no take candle!");
    }

}
