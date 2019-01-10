package Activity2;

/**
 * Created by Teacher on 1/7/2019.
 */
public class Card {

    private String suit;
    private String rank;
    private int value;

    public Card(String rank, String suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    public String suit() {
        return suit;
    }

    public String rank() {
        return rank;
    }

    public int value() {
        return value;
    }

    public boolean matches(Activity2.Card otherCard) {
        if (this.suit.equals(otherCard.suit)) {
            if (this.rank.equals(otherCard.rank)) {
                return this.value == otherCard.value;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return rank + " of " + suit + " ( point value = " + value + ")";
    }
}
