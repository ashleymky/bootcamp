import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    double r1 = 0.1 + 0.2;
    System.out.println(r1); // problem

    // 2 approaches to create BigDecimal Object
    BigDecimal bd1 = new BigDecimal("0.1"); //小用，for string
    BigDecimal bd2 = BigDecimal.valueOf(0.2); //for double
    
    BigDecimal bd3 = bd1.add(bd2); // Math "+" operation
    System.out.println(bd3);

    float f1 = bd3.floatValue();
    double d1 = bd3.doubleValue();
    int i1 = bd3.intValue();
    System.out.println(f1);
    System.out.println(d1);
    System.out.println(i1);

    String s1 = bd3.toString();
    System.out.println(s1);

    // subtract(), multiply()
    BigDecimal bd4 = bd1.subtract(bd2);
    System.out.println(bd4);

    System.out.println(0.3 - 0.1); // 0.1999999..8
    double result = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println(result); //0.2

    System.out.println(0.1 * 0.2); // 0.0200xxx4
    double result2 = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2)).doubleValue();
    System.out.println(result2); // 0.02

    //multiply -> handle decimal places
    // 3.333 * 2 -> 6.666 -> round 2 dp half up -> 6.67
    double result10 = BigDecimal.valueOf(3.333).multiply(BigDecimal.valueOf(2)).setScale(2, RoundingMode.HALF_UP).doubleValue();
    System.out.println(result10); // 6.67

    //divide
    System.out.println(0.3 / 0.1); // 2.999xxx6
    double result3 = BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println(result3); // 3.0

    // 10 /3 -> 0.3333...
    // non-termincating decimal expansion
    double result4 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3), 2, RoundingMode.DOWN).doubleValue();
    System.out.println(result4); // 3.33

    double result5 = BigDecimal.valueOf(16.5).divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_UP).doubleValue();
    System.out.println(result5); // 8.3 (四捨五入)

    double result6 = BigDecimal.valueOf(16.5).divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_DOWN).doubleValue();
    System.out.println(result6); // 8.2

    // x divide 0 -> undefined
    // 0 divide x -> 0
    // BigDecimal.valueOf(9.9).divide(BigDecimal.valueOf(0)); //error


  }
  
}
