import java.util.ArrayList;
import java.util.List;

public class DemoStream {
  
  public static void main(String[] args) {
    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("Petter", 8));
    dogs.add(new Dog("Janvier", 12));
    dogs.add(new Dog("Jeho", 2));

    // Prepare a new arraylist contains dogs with age >= 8
    // ! filtering
    List<Dog> newDogs = new ArrayList<>();
    for (Dog dog : dogs) {
      if (dog.getAge() >= 8) {
        newDogs.add(dog);
      }
    }
    System.out.println(newDogs);
  }


  public static class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public int getAge() {
      return this.age;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return "Dog(" + "name = " + this.name + "; age = " + this.age + ")";
    }

  }
}
