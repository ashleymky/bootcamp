import java.util.Objects;

public class Card {
  private static final int DIAMOND = 1;
  private static final int CLUB = 2;
  private static final int HEART = 3;
  private static final int SPADE = 4;

  private static final int ACE = 1;
  


  private char rank; // 1,2,3,4,5,6,7,8,9,T,J,Q,K
  private char suit; // D,C,H,S spade, heart ,diamond, club

  public Card(char rank, char suit) {
    this.rank = rank;
    this.suit = suit;
  }
  
  public char getRank() {
    return this.rank;
  }

  public char getSuit() {
    return this.suit;
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
    return "Card(" 
      + "rank=" + this.rank
      + ",suit=" + this.suit
      + ")";
  }


    // ACE Diamond vs King Diamond -> 1
    // King Diamond vs ACE Diamond -> -1
    public int compareTo(Card card) {
      if (this.rank == card.getRank()) {
        if
      }
      return 1;
    }
      // compare rank
      // S > H > C > D

  }

  public static int compareTo(char suit1, char suit2) {
    if (suit1 == suit2) 
     return 0;
    if (suit1 > suit2) 
     return -1;
    return 1;
    }
  }

  public static 
}
