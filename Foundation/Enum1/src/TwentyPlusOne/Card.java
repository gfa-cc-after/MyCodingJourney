package TwentyPlusOne;

import java.awt.*;

 class Card {
     // Card class with three enum properties
     private final Color color;
     private final Suit suit;
     private final Rank rank;

     // this below is auto generated constructor
     public Card(Color color, Suit suit, Rank rank) {
         this.color = color;
         this.suit = suit;
         this.rank = rank;
     }

     int getvalue() {
         switch (rank) {
             case TEN, J, Q, K:
                 return 10;
             case A:
                 return 11; //ace as 11
             default:
                 return Integer.parseInt(rank.toString());
         }
     }

     public String toString() {
         return color + " " + rank + " of da " + suit;
     }


 }

enum Color {
    RED, BLACK;
        }

enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES;
}

enum Rank {
   TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, J, Q, K, A,
}


