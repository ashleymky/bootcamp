import java.util.Objects;

public class Card1 {
  private char rank; // 1,2,3,4,5,6,7,8,9,T,J,Q,K
  private char suit; // D,C,H,S spade, heart ,diamond, club

  public Card1(char rank, char suit) {
    this.rank = rank;
    this.suit = suit;
  }

  // ! Override false -> true
  @Override
  public boolean equals(Object obj) {
    // Part 1 : check address first
    if (this == obj) {
      return true;
    }
      // Part 2 : check if Card Object
    if (!(obj instanceof Card)) {
      return false;
    }
    // Part 3 : rank && suit
    Card card = (Card) obj;
    return this.rank == card.getRank() && this.suit == card.getSuit();


    @Override
    public int hashCode() {
      return Objects.hash(this.rank, this.suit);
    }

    @Override
    public String toString() {
      return "Card" + "Rank = " + this.rank;
    }

    // ACE Diamond vs King Diamond -> 1
    // King Diamond vs ACE Diamond -> -1
    public Card compareTo(Card card) {
      // compare rank
      // S > H > C > D
    }
  }



}
