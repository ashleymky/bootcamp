public class DemoArray {
  public static void main(String[] args) {
    // problem
    int x = 2;
    int x2 = 8;
    int x3 = 1000;
    System.out.println(x3); // 1000

    // Array
    // ! Store a set of same type of values
    // For example, a set of int values
    // 3 -> three places to store int values
    int[] arr = new int[3];

    // ! write value into array
    // 0 represents the first place of the array
    arr[0] = 2;
    arr[1] = 8;
    arr[2] = 1000;
    // arr[3] = 10; //error, array length 3, so you cannot access the 4th places

    // ! read value from array
    System.out.println(arr[0]); // 2
    System.out.println(arr[1]); // 8
    System.out.println(arr[2]); // 1000

    // declare double array -> 4 values
    // 1.1, 9.2, -9.8, 77.9
    // print them out

    double[] arr2 = new double[4];
    arr2[0] = 1.1;
    arr2[1] = 9.2;
    arr2[2] = -9.8;
    arr2[3] = 77.9;

    System.out.println(arr2[0]);


  } 
}
