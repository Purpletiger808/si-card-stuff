public class Main {
    public static void main(String[] args) {
        Card[] deckOf52 = new Card[52];
        Card[] deckOf104 = new Card[104];
        fillStandardDeck(deckOf52);
        fillNonStandardDeck(deckOf104, 2);
        for(Card c : deckOf104){
            System.out.println(c);
        }

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
        
    }

    public static Card draw(Card[] deck){
        return deck[(int)(Math.floor(Math.random() * (52)) + 1)];
    }
}
