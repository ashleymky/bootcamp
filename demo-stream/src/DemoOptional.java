import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class DemoOptional {
  
  // We won't set an optional object to the attribute
  // Optional is not for auto-serialization : java object -> JSON (API) or Database
  public static void main(String[] args) {
    ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(8, -2, 100));
    Integer result = findFirstOddNumber(integers);
    if (result != null) { // ! human to remember
      System.out.println(result.doubleValue());
    }
    // requires null check, otherwise java.lang.NullPointerException

    // Java 8
    Optional<Integer> optionalResult = findFirstOddNumber2(integers);
    if (optionalResult.isPresent()) {
      System.out.println(optionalResult.get().doubleValue());
    } else {
      System.out.println("No Odd number");
    }
  }

  // what if no odd number
  // not found -> is NOT an exception
  // !!!! BAD idea: null for not found
  public static Integer findFirstOddNumber(ArrayList<Integer> integers) {
    boolean found = false;
    for (Integer integer : integers) {
      if (integer % 2 == 1) 
      return integer;
    }
    return null; // not found
  }

  // ! Java 8 has a better solution for this scenario.
  public static Optional<Integer> findFirstOddNumber2(ArrayList<Integer> integers) {
    for (Integer integer : integers) {
      if (integer % 2 == 1) 
      return Optional.of(integer);
    }
  
    return Optional.empty(); // a box contains null value
  }

  // how about we use Optional for input param?
  public static Integer sum(Integer x, Integer y) {
    if (x == null || y == null) 
    throw new IllegalArgumentException("x and y should not be null");
    return x + y;
  }
}
