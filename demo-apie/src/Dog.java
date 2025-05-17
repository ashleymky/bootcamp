public class Dog extends Animal {
  private int age;
  private String name;
  private double weight;

  public Dog(double weight, int age) {
    super(age); // must be first
    this.weight = weight;
  }

  public int getAge() {
    return super.getAge();
  }

  public String getName() {
    return this.name;
  }

  public double getWeight() {
    return this.weight;
  }

  public static void main(String[] args) {
    Dog dog = new Dog(40, 30);
    System.out.println(dog.getAge());
    // System.out.println(dog.getName());
    System.out.println(dog.getWeight());
  }
}
