package FargodeepMineExample;

public class FargodeepMine {
    public static void main(String[] args) {

        Npc NPC1 = new Npc(7,"Pickaxe",60,"Goblin");
        Npc NPC2 = new Npc(7,"Bronze pickaxe",60,"Fat Goblin");


        Kobold Kobold1 = new Kobold(12,"Greataxe",300,"Master miner");
        Kobold Kobold2 = new Kobold(50,"BFG",1600,"DOOM Kobold-Goblin mutant");


        Kobold1.sleep();
        System.out.println(" ..");
        Kobold2.Talk();
    }
}
