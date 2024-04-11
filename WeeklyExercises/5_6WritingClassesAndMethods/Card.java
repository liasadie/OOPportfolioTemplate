public class Card {
    public static final String[] SUITS = {"Diamonds", "Hearts", "Spades", "Clubs"};
    public static final String[] VALUES = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    private String suit;
    private String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return value + " of " + suit;
    }
}
