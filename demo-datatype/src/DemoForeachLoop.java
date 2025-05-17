import java.util.Arrays;

public class DemoForeachLoop {
  public static void main(String[] args) {
    int[] arr = new int[] {3, 10, -1};

    // for loop
    // use i as index pattern to read the array values
    // ! for read and write
    for (int i = 0; i < arr.length ; i++) {
      System.out.println(arr[i]);
      // sysout(arr[i] + " " + arr[arr.length - i - 1]);
    }

    // for-each loop: 默認 you want to read the array in sequence, and one by one.
    // ! for read value ONLY
    for (int x : arr) {
      System.out.println(x);
    }

    // array 換位
    int temp;
    for (int i = 0; i < arr.length / 2; i++) {
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
    System.out.println(Arrays.toString(arr));

    Candy[] candies = new Candy[] {new Candy("PINK", 20), new Candy("PURPLE", 30), new Candy("BLACK", 2)};
    for (Candy candy : candies) {
      if (candy.getColor().equals("BLACK")) {
        System.out.println(candy.getNumber());
      }
    }
  }
}
