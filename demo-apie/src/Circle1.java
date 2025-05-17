import java.math.BigDecimal;

public class Circle1 extends Shape {
  private double radius;

  public Circle1(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }

  public static void main(String[] args) {
    Object o1 = new Object();
    Object o2 = new Object();
    Object o3 = o1;

    // Object.class has equals(), hashCode(), toString()
    // ! 1. equals()
    System.out.println(o1.equals(o2)); // false
    System.out.println(o1.equals(o3)); // true
    // ! 2. hashCode()
    System.out.println(o1.hashCode());

    // ! 3. toString()
    System.out.println(o1.toString());


    // Card c1 = new Card('a', 'd');
    // false, if it is using Object.equals(), we do not override in Card.class
    // ! Object.equals() is checking address
    // true, if you re-define Card.equals()


  }

}
