// Skill, Ability, Contract
public class Superman extends Human implements Flyable, Living {

  // private String name;

  public Superman(String name) {
    super(name);
  }

  @Override
  public void fly() {
    System.out.println("I am flying...");
  }
  
  @Override
  public void eat() {
    System.out.println("I am eating...");
  }

  @Override
  public void drink() {
    System.out.println("I am drinking...");
  }

  @Override
  public void walk() {
    System.out.println("I am walking...");
  }
  
  // ! You can override or NOT override speak()
  @Override
  public void speak() {
    System.out.println("I am speaking...");
  }

  public static void main(String[] args) {
    Superman s1 = new Superman("John");
    s1.fly();
    s1.eat();
    s1.drink();
    s1.speak();
    s1.walk();

    Flyable something = new Superman("Peter");
    something.fly(); // Polymorphism
    
    // Hide the method of eat()
    // something.eat()

    Superman s2 = (Superman) something;
    s2.eat();
  }
  }




