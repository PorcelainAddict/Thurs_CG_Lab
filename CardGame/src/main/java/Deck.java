import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;

public class Deck {

    private ArrayList<Card> stack;




    public Deck(){
        this.stack = new ArrayList<Card>();


    }


    public ArrayList<Card> fill() {
        for (SuitType s : SuitType.values()) {
            for (RankType r : RankType.values()) {
                stack.add(new Card(s,r));
            }
        }
        return stack;
    }

    public int getSize(){
        return this.stack.size();
    }

//    public static int[] RandomizeArray(int[] array){
//        Random rgen = new Random();  // Random number generator
//        for (int i=0; i<array.length; i++) {
//            int randomPosition = rgen.nextInt(array.length);
//            int temp = array[i];
//            array[i] = array[randomPosition];
//            array[randomPosition] = temp;
//        }
//        return array;
//    }

    public void shuffleThisShit(){
        Collections.shuffle(stack);
    }

//    public int returnCard(){
//        int i = 0;
//        return stack[i];
//    }

    public Card getCard(){
        return stack.remove(0);
    }








}
