package Domino7;

import java.util.ArrayList;
import java.util.List;

public class DominoesMain {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        orderDominoes(dominoes);

        System.out.println(dominoes);
    }



    // this needs to be called UPON
    static void orderDominoes(List<Domino> dominoes) {
        List<Domino> result = new ArrayList<>();
        result.add(dominoes.get(0));

        while (result.size() < dominoes.size()) {
            for (int i = 1; i < dominoes.size(); i++) {
                Domino lastDomino = result.get(result.size() - 1);
                Domino currentDomino = dominoes.get(i);
                if (lastDomino.getRightSide() == currentDomino.getLeftSide()) {
                    result.add(currentDomino);
                }
            }
        }

        dominoes.clear();
        dominoes.addAll(result);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
