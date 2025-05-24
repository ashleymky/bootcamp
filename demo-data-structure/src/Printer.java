// Java Generic
// ! 1. Less code/class during compile time (StringPrinter, IntegerPrinter)
// ! 2. You still need to define the T type during runtime

import java.util.ArrayList;

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
  }
}
