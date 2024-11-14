import java.util.*;


public class Main {
    public static void main(String[] args) {
        Card[] deckOf52 = new Card[52];
        Card[] deckOf104 = new Card[104];
        fillStandardDeck(deckOf52);
        fillNonStandardDeck(deckOf104, 2);

        Player user = new Player(true);
        Player cpu = new Player(false);
        fillHandOnStart(user, deckOf52);
        fillHandOnStart(cpu, deckOf52);
        System.out.println(user);
        System.out.println(cpu);

    }

    public static void fillStandardDeck(Card[] deck){
        int j = 1;
        for(int i = 0; i < (deck.length); i+=4){
            deck[i] = new Card("clubs", j);
            deck[i+1] = new Card("diamonds", j);
            deck[i+2] = new Card("hearts", j);
            deck[i+3] = new Card("spades", j);
            j++;
        }
    }

    public static void fillNonStandardDeck(Card[] deck, int numDecks){
        int k = 0;
        while(k != numDecks){
            int j = 1;
            for(int i = 0; i < deck.length/numDecks; i+=4){
                deck[i + (52*k)] = new Card("clubs", j);
                deck[i+1 + (52*k)] = new Card("diamonds", j);
                deck[i+2 + (52*k)] = new Card("hearts", j);
                deck[i+3 + (52*k)] = new Card("spades", j);
                j++;
            }
            k++;
        }
    }

    public static Card draw(Card[] deck){
        return deck[(int)(Math.floor(Math.random() * (52)))];
    }

    public static void fillHandOnStart(Player p, Card[] deck){
        for(int i = 0; i < 7; i++){
            p.addCardToHand(draw(deck));
        }
    }
}
