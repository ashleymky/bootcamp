// ! Cat is a kind of "Animal"
// ! After "extends", Cat is a child class, while Animal is a parent class
// ! 1. Inherit all attribute from Parent class
// ! 2. Cannot inherit constructor from Parent class, but we can call the Parent constructor by "super"
// ! 3. Inherit instance method from parent class (Not exactly inherit）

public class Cat extends Animal {
  // private int age;
  private String name;

  // constructor
  public Cat(String name, int age) {
    super(age);
    this.name = name;
  }

  public int getAge() { // 夾硬寫，其實Parent class係有
    return super.getAge() + 10;
  }

  public int getAge2() { // 夾硬寫，其實Parent class係有
    return super.getAge();
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    Cat cat = new Cat("Labu", 13);
    System.out.println(cat.getAge()); // 23
    System.out.println(cat.getAge2()); // 13
    System.out.println(cat.getName()); // Labu
  }
  
}
