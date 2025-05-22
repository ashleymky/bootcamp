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

  }
}
