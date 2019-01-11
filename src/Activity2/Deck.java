package Activity2;

/**
 * Created by Teacher on 1/7/2019.
 */
import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {
    private ArrayList<Card> notDealt = new ArrayList<Card>();
    private ArrayList<Card> dealt = new ArrayList<Card>();

    public Deck(String[] rank, String[] suit, int[] pointValue) {
        for (int i = 0; i < suit.length; i ++) {
            notDealt.add(new Card(rank[i], suit[i], pointValue[i]));
        }
    }

    public boolean isEmpty() {
        return notDealt.size() == 0;
    }

    public int size() {
        return notDealt.size();
    }

    public Card deal() {
        if (notDealt.size() != 0) {
            Card card = notDealt.get(0);
            dealt.add(card);
            notDealt.remove(0);
            return card;
        }
        else return null;
    }

    public void shuffle() {
        while (dealt.size() > 0) {
            notDealt.add(dealt.get(0));
            dealt.remove(0);
        }
        for (int k = 51; k > 0; k --) {
            int r = (int) (Math.random() * (k + 1));
            Card c = notDealt.get(r);
            notDealt.set(r, notDealt.get(k));
            notDealt.set(k, c);
        }
    }
}