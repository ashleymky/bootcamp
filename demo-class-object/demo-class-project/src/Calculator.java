public class Calculator {
  private int x;
  private int y;

  public Calculator(int x , int y) {
    this.x = x;
    this.y = y;
  }

  public int sum() {
    return this.x + this.y;
  }

  public int product() {
    return this.x * this.y;
  }

  public void setX(int x){
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  // static method (formula)
  public static int sum(int x, int y) {
    return x + y;
  }

  public static int product(int x , int y) {
    return x * y;
  }

  public static void main(String[] args) {
    
    Calculator c1 = new Calculator(2, 3);
    System.out.println(c1.sum()); // 2 + 3
    System.out.println(c1.product()); // 2 * 3
    
    c1.setY(10);

    System.out.println(c1.sum()); // 2 + 10 
    System.out.println(c1.product()); // 2 * 10

    c1.setX(3);
    System.out.println(c1.sum());
    System.out.println(c1.product());

    System.out.println(Calculator.sum(2,9));
    System.out.println(c1.sum(1, 3)); // ! ?
    System.out.println(Calculator.product(34, 10));
  }

}

