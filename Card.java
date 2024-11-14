import java.util.*;

public class Card {
    Suit cardSuit;
    String suitString;
    int value;

    public Card(){
        cardSuit = null;
        suitString = "";
        value = 0;
    }

    public Card(String cardSuit, int value){
        this.value = value;

        if(cardSuit.equalsIgnoreCase("Clubs")){
            this.cardSuit = Suit.CLUBS;
            this.suitString = "Clubs";
        }else if(cardSuit.equalsIgnoreCase("Diamonds")){
            this.cardSuit = Suit.DIAMONDS;
            this.suitString = "Diamonds";
        }else if(cardSuit.equalsIgnoreCase("Hearts")){
            this.cardSuit = Suit.HEARTS;
            this.suitString = "Hearts";
        }else if(cardSuit.equalsIgnoreCase("Spades")){
            this.cardSuit = Suit.SPADES;
            this.suitString = "Spades";
        }else{
            this.cardSuit = null;
            this.suitString = "";
        }
    }

    public Suit getCardSuit(){
        return this.cardSuit;
    }

    public void setCardSuit(String newSuit){
        if(newSuit.equalsIgnoreCase("Clubs")){
            this.cardSuit = Suit.CLUBS;
            this.suitString = "Clubs";
        }else if(newSuit.equalsIgnoreCase("Diamonds")){
            this.cardSuit = Suit.DIAMONDS;
            this.suitString = "Diamonds";
        }else if(newSuit.equalsIgnoreCase("Hearts")){
            this.cardSuit = Suit.HEARTS;
            this.suitString = "Hearts";
        }else if(newSuit.equalsIgnoreCase("Spades")){
            this.cardSuit = Suit.SPADES;
            this.suitString = "Spades";
        }else{
            this.cardSuit = null;
            this.suitString = "";
        }
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int newValue){
        this.value = newValue;
    }

    public void setBoth(String newSuit, int newValue){
        if(newSuit.equalsIgnoreCase("Clubs")){
            this.cardSuit = Suit.CLUBS;
            this.suitString = "Clubs";
        }else if(newSuit.equalsIgnoreCase("Diamonds")){
            this.cardSuit = Suit.DIAMONDS;
            this.suitString = "Diamonds";
        }else if(newSuit.equalsIgnoreCase("Hearts")){
            this.cardSuit = Suit.HEARTS;
            this.suitString = "Hearts";
        }else if(newSuit.equalsIgnoreCase("Spades")){
            this.cardSuit = Suit.SPADES;
            this.suitString = "Spades";
        }else{
            this.cardSuit = null;
            this.suitString = "";
        }

        this.value = newValue;
    }


    public boolean equals(Card c){
        boolean isEqual = false;

        if(this.value == c.getValue() && this.cardSuit == c.getCardSuit()){
            isEqual = true;
        }

        return isEqual;
    }


    public String toString(){
        if(value < 2 || value >= 11){
            switch (value){
                case 1:
                    return "Ace of " + suitString;
                case 11:
                    return "Jack of " + suitString;
                case 12:
                    return "Queen of " + suitString;
                case 13:
                    return "King of " + suitString;
                default:
                    return "Definitely An Error: Value =" + value;
            }
        }else{
            return value + " of " + suitString;
        }
    }
}
