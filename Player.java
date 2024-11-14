import java.util.*;

public class Player {
    ArrayList<Card> hand;
    boolean isUser;
    int points;

    public Player(){
        this.hand = new ArrayList<>();
        this.isUser = false;
        this.points = 0;
    }

    public Player(boolean isUser){
        this.hand = new ArrayList<>();
        this.isUser = isUser;
        this.points = 0;
    }

    public void addCardToHand(Card card){
        hand.add(card);
    }

    public void removeCardFromHand(Card card){
        for(Card c : hand){
            if(c.equals(card)){
                hand.remove(c);
            }
        }
    }
    
    public int checkForPairs(){ //Funky code, figure out a better
        int pairs = 0;
        for(Card c : hand){
            for(Card d : hand){
                if(c.equals(d)){
                    pairs++;
                }
            }
        }
        return pairs-hand.size();
    }

    public String toString(){
        String str = "";

        if(this.isUser){
            for( Card c : hand){
                str = str + c.toString() + ", ";
            }
        }else{
            str = str + "No cheating you RAT.";
        }

        return str;
    }
}
