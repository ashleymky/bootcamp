/**
 * Example Output Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] testCase1 = new int[] {-10, 5, 100, 240, 230, 80}; // Second Max = 230
    int[] testCase2 = new int[] {-10, 5, 100, 120, 240, 200}; // Second Max = 200
    int[] testCase3 = new int[] {-10, 5, 120, -100, 100, 240}; // Second Max = 120
    int[] testCase4 = new int[] {-10, 5, 100, 240, 240, 80}; // Second Max = 240

    int secondMax2 = 0;
    // int secondMin2 = 0;

    for (int i = 0; i < testCase1.length; i++) {
      //if (i < testCase1.length - 1) {
        if (testCase1[i] > testCase1[i + 1]) {
          // System.out.println("i = " + i);
          // System.out.println("1 : testCase1[i] > " + testCase1[i]);
          // System.out.println("1 : testCase1[i+1] > " + testCase1[i+1]);
          secondMax2 = testCase1[i];
        } else {
          // System.out.println("2 : testCase1[i] > " + testCase1[i]);
          // System.out.println("2 : testCase1[i+1] > " + testCase1[i+1]);
          secondMax2 = testCase1[i + 1];
        }
        System.out.println("Second Max = " + secondMax2);
      }
    }

  }


  // for (int i = 0; i < testCase1.length; i++) {
  // System.out.println("secondMax : " + secondMax);
  // if (testCase1[i] > secondMax) {
  // secondMax = testCase1[i];
  // }

// System.out.println("Second Max = " + secondMax);

// for (int i = 0; i < testCase1.length; i++) {
// if (testCase1[i] > secondMin) {
// secondMin = testCase1[i];
// }
// System.out.println("Second Min = " + secondMin);
// }



// Your program should be able to handle all the above test case.
// code here ...

