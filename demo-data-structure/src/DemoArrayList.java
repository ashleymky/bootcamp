import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

  public static void main(String[] args) {
    String[] arr = new String[] {"abc", "def", "ijk"};
    for (String s : arr) {
      System.out.println(s);
    }

    // Disadvantages of array:
    // 1. Fixed length (<- ArrayList fixed this issue)
    // 2. Same type of value (<- Java won't solve this issue)

    // Java allow Object[] to store any type of objects...
    // but Java follows Polymorphism, the allowed method refers to the type of object reference.
    Object[] arr2 = new Object[] {"abc", "YO"};
    for (Object s : arr2) {
      if (s instanceof String) {
        String str = (String) s;
        System.out.println(str.charAt(0));
      }
    }

    // ArrayList : variable length
    // The underlying data structure of ArrayList -> array
    ArrayList<String> names = new ArrayList<String>();
    names.add("John");
    names.add("Peter");
    System.out.println(names.size()); // 2
    System.out.println(names.remove(1)); // Peter

    names.remove("Peter");
    System.out.println(names.size()); // 1

    names.add("Jennie");
    // Author of ArrayList overrise toString()
    System.out.println(names); // [John, Jennie]

    StringArrayList sal = new StringArrayList();
    sal.add("Disney");
    sal.add("Pizel");
    System.out.println(sal.size());
    sal.remove("Disney");
    System.out.println(sal.size());

    if (names.contains("Jennie")) {

    }

    if (!names.contains("Peter")) {

    }
    
    System.out.println(names.indexOf("Disney"));
    System.out.println(names.indexOf("Dad"));

    if (!names.isEmpty()) {

    }

    //! becasue ArrayList is with ordering
    System.out.println(names.getFirst()); 
    System.out.println(names.get(1));

    List<String> reversed = names.reversed(); // not important
    System.out.println(reversed);

    names.clear(); 
    System.out.println(names.isEmpty());
    System.out.println(names.size());
    names = null; // what is difference between line 69 & null

    // remove Dog
    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("Roaf"));
    dogs.add(new Dog("Mow"));
    dogs.remove(new Dog("Roaf"));
    

  }
}
