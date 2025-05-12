public class Child {
  // ! static -> common attribute, NOT belongs to any object
  // ! but all objects can access the static variable
  private static int counter = 0; // 冇加 static = all child 有counter

  // Every Child object has id, firstName and lastName. But no counter.
  // Attribute (Instance variable)
  // Instance = object
  private String firstName;
  private String lastName;
  private long id;

  // constructor
  public Child(String firstName, String lastName) {
    counter++; // counter + 1
    this.id = counter;
    this.firstName = firstName;
    this.lastName = lastName;
}

  // getter
  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public long getid() {
  return this.id;
  }

  // ! Rewrite the definition of Child in your world.
  public boolean equals(Child child) {
    return this.id == child.getid();
    // return this.firstName.equals(child.getFirstName())
    // && this.lastName.equals(child.getLastName());
  }

  public static void main(String[] args) {
    Child c1 = new Child("Leo", "Chan");

    // Approach 1
    if(c1.getFirstName().equals("Leo") && c1.getLastName().equals("Chan")) {
      System.out.println("HE IS LEO CHAN"); // HE IS LEO CHAN
    }

    // Approach 2
    System.out.println(c1.equals(new Child("Leo", "Chan"))); 

    Child c2 = new Child("Leo", "Wong");
    System.out.println(c1.getid());
    System.out.println(c2.getid());
    System.out.println(c2.getFirstName().equals("LEO"));

  }


}
