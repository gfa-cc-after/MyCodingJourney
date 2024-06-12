package FargodeepMineExample;

public class Npc {

    String name;
    int lvl;
    String weapon;
    int xpGain;

    public Npc(int lvl, String weapon, int xpGain,String name) {
        this.lvl = lvl;
        this.weapon = weapon;
        this.xpGain=xpGain;
        this.name=name;
    }

    public void sleep(){
        System.out.println(this.name + "...Zzzz.zzZZZ..");
    }

}
