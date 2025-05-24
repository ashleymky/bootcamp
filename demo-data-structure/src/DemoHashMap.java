import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // A set of same type values: array, ArrayList, HashSet

    // Key -> Get a set of same type values
    // HashMap <Key, Value>
    // Key + Value -> Entry (row)
    HashMap <String, String> fruitMap = new HashMap<>();
    fruitMap.put("A", "Apple");
    fruitMap.put("O", "Orange");
    fruitMap.put("L", "Lemon");

    System.out.println(fruitMap.size());
    System.out.println(fruitMap.get("A"));
    System.out.println(fruitMap.get("X"));

    if (fruitMap.containsKey("A")) {

    }

    if (fruitMap.containsValue("Apple")) {
      
    }

    String removedValue = fruitMap.remove("0");
    System.out.println(removedValue); //  Orange

    // HashMap:
    // 1 . No Ordering

    // for-each loop
    for (Map.Entry<String, String> entry : fruitMap.entrySet()) {
      System.out.println(entry.getKey() + "," + entry.getValue());
    }

    // new LinkedHashMap<>();

  }
}
