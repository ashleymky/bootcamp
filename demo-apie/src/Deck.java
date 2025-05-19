import java.util.Arrays;

public class Deck {
  private static final int[] RANKS = new int[] {1,2,3,4,5} ;
  private static final Suit[] Suit = new Suit[] {"DIAMMOND", ...};
  private Card[] cards;

  //public Deck() {
  //  cards = new Card[52];
  //  for ()
  

  public Card[] getCards() {
    return this.cards;
  }
  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(Arrays.toString(deck.getCards()));

    int[] arr = new int[] {1,2,3};
    System.out.println(Arrays.toString(arr));

    // for-each
    for (Suit suit : Suit.values()) {
      System.out.println(suit);
    }

    System.out.println(Suit.values().length);
    System.out.println(Suit.DIAMOND);

  }
}
