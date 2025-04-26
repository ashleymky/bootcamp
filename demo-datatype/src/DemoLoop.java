public class DemoLoop {
  public static void main(String[] args) {

    int x = 2;
    x = x * 2;
    x = x * 2;
    // 2^3

    // ! For Loop
    // for (initialization; continue condition; modifier)
    // Step 1: i = 0
    // Step 2: check if i < 3
    // Step 3: if yes, print Hello
    // Step 4: i + 1
    // Step ... run till
    // Step LAST: No -> exit loop

    for (int i = 0; i < 3; i++) { // i=0,1,2 固定i=0 & i<XXX!
      System.out.println("Hello");
    }

    // 2^10
    int y = 2;
    for (int i = 0; i <9; i++) {
      y = y * 2;
      System.out.println(y);
    }

    // for + if
    // print even numbers between 0-10
    // even number -> x % 2 == 0
    for (int i = 1; i < 11; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // for + if
    // Print the char index of 'm', if found, print the index; if not found, print -1
    String s2 = "bootcamp";
    int index = -1;
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == 'm') {
        index = i;
      } else {
        System.out.println(index);
      }
    }


    // ! break + LOOP
    // Find the first character of 'a' in a given String, print the index of the character.
    String str = "character";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a') {
        System.out.println(i); // 2
        break; // break the whole loop (stop the loop, exit the loop)
      }
    }

    // Find the first 3 character of 'a' in a given String
    String ss = "abcdeabcdeabcdeabcdeabcde";
    int counter = 0;
    for (int i = 0; i < ss.length(); i++) {
      if (ss.charAt(i) == 'a') { // 0,1,2
        if (counter >= 3) {
          break;
        }
        System.out.println(i);
        counter++;
      }
    }

    // ! continue + Loop
    // Print all index of character 'a' in a given String
    String ss2 = "abcabcabc";
    for (int i = 0; i < ss2.length(); i++) {
      if (ss2.charAt(i) == 'a') {
        System.out.println(i);
      }
    }
    for (int i = 0; i < ss2.length(); i++) {
      if (ss2.charAt(i) != 'a') {
        continue; // SKIP!! the rest of code lines, and then goes to next iteration
      }
      System.out.println(i);
    }

  }
}
