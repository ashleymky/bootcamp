public class Candy {
  private static int count = 20;
  private String color;
  private int number;

  public Candy(String color, int number) {
    this.color = color;
    this.number = number;
  }
  // Candy has color, number

  public String getColor() {
    return this.color;
  }

  public int getNumber() {
    return this.number;
  }

  public static void main(String[] args) {
    Candy c1 = new Candy("Red", 4);
    Candy[] candies = new Candy[] {}
    // Candy c1 = new Candy("RED", 3);
    Candy c2 = new Candy("YELLOW", 4);
    System.out.println(c1.getColor());

    // Distribute 20 Candy to 3 Student
    // Every Student has his own candies 擁有者
    // Print out the candy (color, number) of every students
    // Use loop to distribute candies

    // Teacher.java -> distribute
    // Student -> receive (Candy candy)
  }

}
