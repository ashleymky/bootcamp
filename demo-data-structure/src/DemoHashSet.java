import java.util.ArrayList;
import java.util.HashSet;

public class DemoHashSet {

  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("John");
    strings.add("Peter");
    strings.add("Ashley");
    System.out.println(strings.size());
    System.out.println(strings); // not in ORDER

    // The underlying data structure is not array
    strings.remove("Peter"); // equals()
    strings.add("John");
    System.out.println(strings);

    // The differentce between ArrayList and HashSet
    // 1. No ordering
    // 2. Naturally avoid duplicated values

    boolean result = strings.add("John");
    System.out.println(result); // false
    System.out.println(strings);

    // isEmpty, contains, clear(), etc ... same as ArrayList

    // example: ArrayList<String>, "Apple" "orange" "Apple" "lemon"

    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("apple");
    fruits.add("lemon");

    // loop + hashset + add()
    boolean foundDuplicated = false;
    HashSet<String> fruitSet = new HashSet<>();
    for (String fruit : fruits) {
      if (!fruitSet.add(fruit))
        foundDuplicated = true;
      break;
    }

    System.out.println("Found duplicated fruit: " + foundDuplicated);

  }
}
