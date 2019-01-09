package Activity1;

/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

    private String suit;
    private String rank;
    private int value;

    public Card(String rank, String suit, int value) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    public String suit() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        return suit;
    }

    public String rank() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        return rank;
    }

    public int value() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        return value;
    }

    public boolean matches(Card otherCard) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        if (this.suit.equals(otherCard.suit)) {
            if (this.rank.equals(otherCard.rank)) {
                if (this.value == otherCard.value) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Converts the rank, suit, and point value into a string in the format
     *     "[Rank] of [Suit] (point value = [PointValue])".
     * This provides a useful way of printing the contents
     * of a <code>Deck</code> in an easily readable format or performing
     * other similar functions.
     *
     * @return a <code>String</code> containing the rank, suit,
     *         and point value of the card.
     */
    @Override
    public String toString() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */


        return "This section isn't finished yet, come back later!";
    }
}

