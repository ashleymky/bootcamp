// Java Generic
// ! 1. Less code/class during compile time (StringPrinter, IntegerPrinter)
// ! 2. You still need to define the T type during runtime

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

// E -> Java for collection.class
// K, V -> Java for Map
// T , U , V -> Universally we use these...
public class Printer<T> {
  private T value;

  public Printer(T value) {
    this.value = value;
  }

  public void print() {
    System.out.println(value);
  }

  public void setValue(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public static void main(String[] args) {
    // Runtime: StringPrinter
    Printer<String> sp = new Printer<>("Hellooo");
    // sp.setValue(100) > ERROR!, because you already defined T is String
    sp.setValue("Goodbye");
    sp.print();

    Printer<Integer> ip = new Printer<>(10);
    ip.setValue(2000);
    ip.print();

    // ! You don't have to write StringArrayList, IntegerArrayList
    ArrayList<String> names = new ArrayList<>();
    names.add("Peter");
    // names.add(10);

    // Key = String, Value = List<Dog>
    HashMap<String, List<Dog>> dogMap = new HashMap<>();
    List<Dog> dogList1 = new LinkedList<>();
    dogList1.add(new Dog("Prodal"));
    dogList1.add(new Dog("Brendal"));
    dogMap.put("ABC",dogList1);
    List<Dog> dogList2 = new LinkedList<>();
    dogList2.add(new Dog("UTER"));
    dogList2.add(new Dog("WONKA"));
    dogMap.put("ABC",dogList2);

    System.out.println(dogMap.get("ABC"));

    Printer<List<Dog>> dogListPrinter = new Printer<>(new LinkedList<>());
    dogListPrinter.getValue().add(new Dog("JOhn"));
    dogListPrinter.print();
  }
}
