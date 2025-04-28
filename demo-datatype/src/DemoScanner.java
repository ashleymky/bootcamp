import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {

    //讓Terminal 入數字再print出
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number:");
    int input = scanner.nextInt(); // capture input

    String s = ""; // Even or Odd

    if (input % 2 == 0) {
      s = "even";
    } else {
      s = "odd";
    }
    System.out.println("The input is an " + s + " number.");






  }
}
