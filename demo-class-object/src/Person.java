import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height, weight
  // BMI = dividing your weight in kilograms by your height in metres squared
  private double height;
  private double weight;
  //private boolean isOverweight;

  public Person(double height, double weight) {
    this.height = height;
    this.weight = weight;
  }

  public void exercise() {
    this.weight -= 0.1;
  }
  // ! methods:

  // BMI -> double
  public double bmi() {
    BigDecimal result =
        BigDecimal.valueOf(height).multiply(BigDecimal.valueOf(height));
    return BigDecimal.valueOf(weight).divide(result, 2, RoundingMode.HALF_DOWN)
        .doubleValue();
  }


  // isOverweight -> boolean (BMI>25)
  public boolean isOverweight() {
    return this.bmi() > 25;
  }

  // ! main
  // Person[] -> p1, p2, p3
  // for loop () -> array -> Print out their BMI & weight status
  public static void main(String[] args) {

    Person p1 = new Person(1.76, 80);
    Person p2 = new Person(1.57, 49);
    Person p3 = new Person(1.57, 49);
    System.out.println(p1.bmi());
    System.out.println(p1.isOverweight());

    Person[] persons = new Person[3];
    persons[0] = p1;
    persons[1] = p2;
    persons[2] = p3;
  

  for (int i = 0;i< persons.length;i++) {
    System.out.println(persons[i].bmi() + ", " + persons[i].isOverweight());
  }

  }
}
