// Inherit

public class Animal { // Parent class
  private int age;


public Animal(int age) {
  this.age = age;
}

public int getAge() {
  return this.age;
}
  
  public static void main(String[] args) {
    Animal animal = new Animal(13);

  }
}
