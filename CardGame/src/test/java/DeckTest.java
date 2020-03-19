import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Card card;
    Deck deck;
    Player player;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.QUEEN);
        deck = new Deck();
        player = new Player("Austin Powers");


    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.QUEEN, card.getRank());
    }

    @Test
    public void queenHasValue10(){
        assertEquals(10, card.getValueFromEnum());
    }

    @Test
    public void getFiftyTwo(){
        deck.fill();
        assertEquals(52, deck.getSize());
    }

    @Test
    public void checkZero(){
        deck.fill();
        deck.shuffleThisShit();
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void getHand(){
        deck.fill();
        deck.shuffleThisShit();
        player.dealCard(deck.getCard());
        assertEquals(1, player.getHand().size());
        assertEquals(51, deck.getSize());
    }


}
