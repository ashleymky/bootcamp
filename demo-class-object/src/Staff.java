public class Staff {
  private long id;

  public Staff(long id) {
    this.id = id;
  }

  public long getID() {
    return this.id;
  }
  // equals() -> String, integer, double

  public boolean equals(Staff staff) {
     if (this.id == staff.getID()) {
      return true;
     }
     return false;
  }

  public static void main(String[] args) {
    Staff s1 = new Staff(1L);
    // Staff s2 = new Staff(1L);

    // asking if the staff id = 1
    if (s1.getID() == 1L) {

    }
    System.out.println(s1.equals(new Staff(1L))); // support true, but false now (if we do not rewrite equals() method)
    // ! by default, Java implicitly say that equals() checking object's address

    // after rewriting the equals method, new Staff(1) equal staff(2)
  }
    
  }


