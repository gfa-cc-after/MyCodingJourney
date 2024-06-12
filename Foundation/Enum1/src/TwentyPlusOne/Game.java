package TwentyPlusOne;

import org.junit.jupiter.api.MethodOrderer;

import java.util.Scanner;
/*
public class Game {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffleDeck();

        int opponentScore = generateRandomNumber(15, 21);
        int playerScore = 0;

        Scanner scan1 = new Scanner(System.in);

        while (true) {
            System.out.println("Opponent Score: " + opponentScore);
            System.out.println("Your Score: " + playerScore);

            System.out.println("Do you want to continue drawing cards? (yes/no)");
            String response = scan1.nextLine().toLowerCase();

            if ("no".equals(response)) {
                break;
            }

            Card drawnCard = deck.pullRandom();
            System.out.println("You drew: " + drawnCard);

            playerScore += drawnCard.getValue();

            if (playerScore > 21 || playerScore < opponentScore) {
                System.out.println("Game Lost!");
                break;
            }

            if (playerScore == 21) {
                System.out.println("Twenty Plus One! You win!");
                break;
            }
        }

        scan1.close();


    }
}

*/