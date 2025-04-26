public class DemoMath {
  public static void main(String[] args) {
    // pow
    // 2^4 = 16

    double result = Math.pow(2.0, 4.5);
    System.out.println(result);

    //
    int x = 3;
    int y = 7;
    System.out.println(Math.abs(x - y)); // 4 (2個數字的距離)

    System.out.println(Math.round(9.34582)); // 9 , rounding down
    System.out.println(Math.sqrt(81)); // 9.0
    System.out.println(Math.max(3, 9)); // 9
    System.out.println(Math.min(-1, 3)); // -1
  }
}
