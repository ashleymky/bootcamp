public class Demoif {
  public static void main(String[] args) {

    int x = 10;
    if (x < 4) { // true / false
      System.out.println("hello");
    }


    // if + else
    if (x < 10) {
      System.out.println("Goodbye");
    } else {
      System.out.println("welcome");
    }

    // ! Rules:
    // Step 1: try "if" condition, if it is true, execute the action, and then EXIT
    // Step 2: if Step 1 is false, try "else if" condition, if it is true, execute the action, and then EXIT
    // Step 3: if step result is false, then goes to "else", execute the action

    // if + else if + else
    int y = 90;

    if (y < 90) {
      System.out.println("y is smaller than 90.");
    } else if (y >= 90 && y < 100 ) {
      System.out.println("y is 90 < 99");
    } else { // y >= 100
      System.out.println("y >= 100");}

    // double w
    // if w < 100, print "ABC"
    // w between 103 & 110, print "DEF"
    // for other values, print "XYZ"

    int w = 40;

    if (w < 100) {
      System.out.println("ABC");
    } else if (w <= 110 && w >= 103) {
      System.out.println("DEF");
    } else {
      System.out.println("XYZ");
    }

    // AND &&
    // OR ||

    int a = 1;
    int b = 10;

    if (a > 3 || b < 15) {
      System.out.println("A>3 OR B<15");
    } else {
      System.out.println("ERROR!");
    }

    int q = 4;
    int u = 80;

    if (q > 2) {
      u = u + 2; //fulfilled左就會行呢個,不會去下一行
    } else if (q < 5) { //repeated condition, NONONO, 令人混淆
      u = u + 10;
    }

    q = 10;
    u = 100;
    if ( q > 5 && u < 99) {
      System.out.println("GO");
    } else if (q <= 5) {
      System.out.println("Well");
    } else { // q > 5 && u >= 99
      System.out.println("bootcamp");
    }
    

    // String
    String s1 = "hello";
    System.out.println(s1.length()); // 5

    if (s1.length() > 3) {
      System.out.println("Java");
    } else {
      System.out.println("Python");
    }

    // equals() + if
    String y1 = "Ashley";
    if (y1.equals("Ashley")) {
      System.out.println("Good");
    } else {
      System.out.println("BAD");
    }

    // charAt
    // check if the first character of string is "c" or the last character is 'd'
    // if yes print "yes", if no print "no"

    String s3 = "Chain";
    if (s3.charAt(0) == 'C' || s3.charAt(s3.length() - 1) == 'd') {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

  }
}
