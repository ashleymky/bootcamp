public class DemoDataPrimitives {
  public static void main(String[] args) {
    System.out.println("Ho");


    //byte, short, int, long (Store Integer)
    byte b1 = 3;
    short s1 = 3;
    int i1 = 3;
    long l1 = 3;

    // byte (只儲存 -128 至 127的數)
    // short (只儲存-32xxx - 32xxx的數)
    // int (只儲存-21億.x - 21億.x的數)
    // long (2^63)

    b1 = -128;
    s1 = 32767;
    i1 = 2_147_483_647;
    // il + 1 -> -2147483648 (overflow)
    il = il + 1;
    System.out.println(il);

    l1 = 2_200_000_000; // error as we assign value into long variable
    l1 = 2_200_000_000L;

    // long + int -> long + long -> long
    long l2 = 2_200_000L + 5;

  }
}
