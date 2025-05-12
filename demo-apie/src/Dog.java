public class Dog extends Animal {
  private int age;
  private String name;

  public Dog(String name, int age) {
    super(age); // must be first
    this.name = name;
  }

  public int getAge() {
    return super.getAge();
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    Dog dog = new Dog("Woof", 30);
    System.out.println(dog.getAge());
    System.out.println(dog.getName());
  }
}
