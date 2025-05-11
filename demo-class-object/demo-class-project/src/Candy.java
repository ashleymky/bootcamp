public class Candy {
  private static int count = 20;
  private String color;
  private int number;

  public Candy(String color, int number) {
    count--;
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
    Candy c1 = new Candy();
    Candy c2 = new Candy();

    // Distribute 20 Candy to 3 Student
    // Every Student has his own candies 擁有者
    // Print out the candy (color, number) of every students
    // Use loop to distribute candies

    // Teacher.java -> distribute
    // Student -> receive (Candy candy)
  }

}
