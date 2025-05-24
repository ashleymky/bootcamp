import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
  
  public static void main(String[] args) {
    // Queue
    // 1. add() - > addLast()
    Queue<String> fruits = new LinkedList<>();
    fruits.add("Lemon");
    fruits.add("Mango");
    fruits.add("Peach"); 
    System.out.println(fruits.poll()); // Lemon : .poll -> 拎第一個element, but not remove
    System.out.println(fruits.size());
    // no get() method in Queue
    System.out.println(fruits.peek()); // take a look on the first element
    System.out.println(fruits.size());

    // The most common logic to use a queue
    while (!fruits.isEmpty()) {
      System.out.println(fruits.poll());
    }
    if (!fruits.contains("Peach")) {
      System.out.println("Yum");
    }

    // ! Why queue? arrayList is also with ordering
    // 1. queue has less method to use (for specific usage), but list is more general for more scenario

    // ! The difference between LinkedList and ArrayDeque, while using Queue interface
    // 1. the underlying data structure

    // ! Deque: Add and remove from first element and last element
    Deque<String> fruits2 = new LinkedList<>();
    fruits2.addLast("Pumpkin");
    fruits2.addFirst("Apple");
    fruits2.addFirst("Orange");    
    fruits2.addLast("Watermelon");
    System.out.println(fruits2);
    System.out.println(fruits2.size());
    if (fruits2.contains("Orange")) {
      
    }




    // List<String> fruits3 = new LinkedList<>();

  }
}
