public class DemoWhileLoop {
  public static void main(String[] args) {
    // Alternative - for loop
    // ! Don't use i as variable name in any method

    for (int i = 0 ; i < 5 ; i++) {
      System.out.println("Hello");
    }

    int count = 5;
    while (count-- > 0) { // 5,4,3,2,1
      System.out.println("Bye");
      if (count / 2 == 0) {
        break;
      }
      //if () {
       // break;
      }
    }
    // while (count > 0) { ... count--;} = while (count-- > 0) {}



    // ! Difference
    // 1. While: flexible for modifiers (conditional) VS For: stand writing code style
    // 2. While: flexible for break;
  }

