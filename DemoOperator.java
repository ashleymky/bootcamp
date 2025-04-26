public class DemoOperator {
  public static void main(String[] args) {
    // x,-,*,/,%
    int x = 3;
    x = 6 + 9;

    int y = 5 + x - 10;
    System.out.println(y);
    
    // 9 * 2 first
    int a = y - 9 * 2;
    System.out.println(a);

    int b = (y - 9) * 2;
    System.out.println(b);

    // divided by zero
    // int r = 10 / 0; // system error
    // ! java : int / int -> int
    int r3 = 10 / 3 ;
    System.out.println(r3);

    //double / int -> double / double -> double
    System.out.println(5.0 / 2);

    int score1 = 71;
    int score2 = 82;
    // double averageScore = (score1 + score2) / 2; //76
    // double averageScore = (score1 + score2) / 2.0; //76.5

    //big problem
    double d5 = 0.1 + 0.2;
    System.out.println(d5); // 0.30000000000000004
    double d6 = 0.2 + 0.3;
    System.out.println(d6); // 0.5

    // ! remainder (餘數) of 10 / 3
    int r8 = 10 % 3;
    System.out.println(r8); //1

    int johnAge = 64;
    boolean isElderly = johnAge >= 65; // formula / definition
    System.out.println(isElderly); //false

    int result = 10;
    // "result % 2 == 1" -> true

    //boolean
    boolean isResultOddNumber = result % 2 == 1; // "==" -> check if equals to 
    System.out.println(isResultOddNumber); // false

    // char
    // single quote
    char c1 = 'a'; // assign char value 'a' into char variable

    // float (store decimal number)
    
    // ! float f1 = 3.14159; // 3.14159 is double value, assign double value to float variable -> unsafe
    float f1 = 3.14159f;

    // problem
    f1 = 0.3f + 0.4f;
    System.out.println(f1); // 0.70000005

    // by default, we cannot assign a bigger range of variable to smaller range of variable
    // but we can force assign
    // byte b40 = (byte) 129L; -> -127 (overflow)

    // + 1 and -1
    int t = 0;
    t++;
    ++t;
    t = t + 1;
    // "= t +" -> "+="
    t += 1;
    System.out.println(t); //4

    int w = 0;
    w--;
    --w;
    w = w - 1;
    w -= 1;
    System.out.println(w); //-4

    // +/- non 1 value
    int o = 3;
    o -= 4;
    o += 4;
    System.out.println(o); //3

    int q = 3;
    q = q * 3; // 等於 q *= 3;
    System.out.println(q); //9

    int v = 27;
    v /= 3;
    v =  v / 3;
    System.out.println(v); //3

    // Comparison
    // >, <, >=, <=, ==, !=
    int score = 91;
    boolean isGradeA = score >= 90;
    System.out.println(isGradeA); // true

    char gender = 'F';
    boolean isFemale = gender != 'M';
    System.out.println(isFemale); // true
    
  }
}
