public class DemoString {
  public static void main(String[] args) {
    //String is NOT primitive, which consist of a set of char values
    String s = "John";
    String s2 = "Dear Sir,";

    // 8 Primitives -> store values ONLY
    // String -> store values + functions
    String s3 = "Steven";
    s3 = "Vincent";
    System.out.println(s3); //Vincent

    // Function 1 : equals()
    System.out.println(s3.equals("Vincent")); //true
    System.out.println(s3.equals("vincent")); //false, case sensitive

    // Function 2 : length()
    System.out.println(s3.length()); //7

    // Function 3 : charAt()
    // index starts with 0
    System.out.println(s3.charAt(2)); // 'n', the char at position 3

  }

}