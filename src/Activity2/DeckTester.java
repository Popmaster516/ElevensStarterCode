package Activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds"};
        String[] ranks = {"A", "B", "C"};
        int[] values = {1,2,3};
        Deck testDeck = new Deck(ranks,suits,values);
        System.out.println("  deal: " + testDeck.deal());
        System.out.println("  toString:\n" + testDeck.toString());
        System.out.println("  isEmpty: " + testDeck.isEmpty());
        System.out.println("  size: " + testDeck.size());

    }
}