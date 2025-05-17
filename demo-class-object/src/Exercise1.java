public class Exercise1 {
  private String name;
  private int age;

  public Exercise1(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public boolean isOld() {
    return this.age > 30;
  }

  public static void main(String[] args) {
    
    Person[] persons = new Person[2];
    Person[0] = p1;
    Person[1] = p2;
    Person p1 = new Person("Jane", 2);
    if (p1.isOld() == true) {
      System.out.println("This person is old");
    }

  }
}
