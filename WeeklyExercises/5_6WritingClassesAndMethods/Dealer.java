import java.util.Random;

public class Dealer {
    public static void main(String[] args){
        Random random = new Random();

        for (int i = 0; i < 5; i++){
            int suitIndex = random.nextInt(Card.SUITS.length);
            int valueIndex = random.nextInt(Card.VALUES.length);

            String suit = Card.SUITS[suitIndex];
            String value = Card.VALUES[valueIndex];

            Card card = new Card(suit, value);
            System.out.println(card);
        }
    }
}