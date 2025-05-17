// Inherit

public abstract class Animal { // Parent class: concrete class or abstract class (你的世界冇XXX)
  private int age;

// ! why abstract class still have constructor? 
//for Child class constructor to call
public Animal(int age) {
  this.age = age;
}

public int getAge() {
  return this.age;
}
  
  public static void main(String[] args) {
    Animal animal = new Cat(13);
    Cat cat = new Cat("Peter", 2);

    // ! abstract class is not for object creation : ! abstract class Animal -> no new Animal
    // Animal animal2 = new Animal(13);

    // ! Polymorphism (Runtime/Dynamic Polymorphism)
    // ! 1. instance method call is determined by object reference type (compile-time)
    // ! 2. the implementation of method is determined by actual object itself (runtime)
    Animal cat2 = new Cat("John", 20);
    // "cat2" = object reference
    // "Animal = object reference type
    // "new Cat("John", 20) = object/ object reference value
    
    cat2 = new Dog(10, 7);
    // cat2.getName(); // Java cannot ensure cat2 is point to Cat Object, it may be Dog object
    System.out.println(cat2.getAge()); // -99 -> override
    cat2 = new Cat("Pette" , 80);
    System.out.println(cat2.getAge()); // 80+10

    // ! 組合skill: instanceof + downcast
    if (cat2 instanceof Cat) {
      Cat animal2 = (Cat) cat2;
      System.out.println(animal2.getName());
    } else if (cat2 instanceof Dog) {
      Dog animal3 = (Dog) cat2;
      System.out.println(animal3.getWeight()); // 10.0
    }


    }




  }
}
