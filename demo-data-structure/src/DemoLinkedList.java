import java.util.LinkedList;

public class DemoLinkedList {
  
  public static void main(String[] args) {
    // ArrayList and LinkedList

    // Same:
    // 1. Ordering
    // 2. Store a set of values

    // Difference:
    // 1. Underlying Data structure: array vs linkedlist
    // 2. Scenario : get(), add(), remove()

    LinkedList<String> fruits = new LinkedList<>();
    fruits.add("Melon");
    fruits.add("Durian");
    fruits.add("Berry");
    fruits.add("Kiwi"); 
    System.out.println(fruits.size());
    System.out.println(fruits.get(1));   
    // fruits.remove(3);
    // System.out.println(fruits.size());

    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    if (fruits.contains("Melons")) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    fruits.addFirst("Strawberry"); // 插入在前面
    System.out.println(fruits);
  }
}
