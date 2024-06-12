package TwentyPlusOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {private final ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        for (Color color : Color.values()) {
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    cards.add(new Card(color, suit, rank));
                }
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards, new Random());
    }

    public Card pullFirst() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("Deck is empty");
        }
        return cards.remove(0);
    }

    public Card pullLast() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("Deck is empty");
        }
        return cards.remove(cards.size() - 1);
    }

    public Card pullRandom() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("Deck is empty");
        }
        Random random = new Random();
        int randomIndex = random.nextInt(cards.size());
        return cards.remove(randomIndex);
    }
}
