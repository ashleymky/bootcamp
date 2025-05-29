import java.util.PriorityQueue;
import java.util.Queue;

public class Person {
  private int age;


  public Person(int age) {
    this.age = age;
  }
  public boolean isElderly() {
    return this.age > 65;
  }

  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    Queue<Person> persons = new PriorityQueue<>(new SortedByElderly());
    persons.add(new Person(55));
    persons.add(new Person(45));    
    persons.add(new Person(5));
    persons.add(new Person(60));
    System.out.println(persons.poll());
    persons.add(new Person(18));
    persons.add(new Person(55));

    for (Person p : persons) {
      System.out.println(p.getAge());
    }

    // ! Sorting during add() or poll()?
    // Ans: Poll()

    Queue<Person> persons2 = new PriorityQueue<>(new SortedByElderly());
    persons2.add(new Person(55));
    persons2.add(new Person(45));    
    persons2.add(new Person(5));
    while (!persons2.isEmpty()) {
      System.out.println(persons2.poll().getAge());
    }
  }
}
