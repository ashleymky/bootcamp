public enum Suit {
  DIAMOND, // no need DIAMOND (1),
  CLUB,
  HEART,
  SPADE,
  ;

  //private int value;

  //private Suit(int value) {
  //  this.value = value;
  //}

  //public int getValue() {
  // return this.value;
  //}

  // public int compareTo(Suit suit) {
  //  if (this = suit)
  //  return 0;
  //  if (this.getValue() > suit.getValue())
  //  return -1;
  //  return 1;
  //  }

  public static void main(String[] args) {
    //enum compareTo -> ordering
    System.out.println(DIAMOND.compareTo(SPADE)); // -3 (1-4)
  }


}
