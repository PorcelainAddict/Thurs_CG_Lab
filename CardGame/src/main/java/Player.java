import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> deck;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.deck = deck;
        this.hand = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int iTooLikeToLiveDangerously(){
        int total = 0;
        for(Card card : this.hand){
            total += card.getValueFromEnum();
        }
        return total;
    }

    public void dealCard(Card card){
        hand.add(card);
    }


}
