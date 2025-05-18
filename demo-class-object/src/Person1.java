public class Person1 {
  private String name;
  private int age;

  public Person1(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public boolean isOld() {
    return this.age > 30;
  }

  public static void main(String[] args) {
    
    Person1 p1 = new Person1("Jane", 30);
    Person1 p2 = new Person1("Ashley", 60);
    Person1[] persons = new Person1[2];
    persons[0] = p1;
    persons[1] = p2;

    if (p1.isOld() == true) {
      System.out.println(p1.getName() +" is old");
    } else {
      System.out.println(p1.getName() +" is young");
    }

    if (p2.isOld() == true) {
      System.out.println("This person is old");
    } else {
      System.out.println("This person is young");
    }

  }
}
