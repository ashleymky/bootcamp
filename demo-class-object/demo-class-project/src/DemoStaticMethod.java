public class DemoStaticMethod {
  
  private int age;

  public DemoStaticMethod(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  // ! most of the instance methods are presentations
  // ! presentation (presenting the content of the object)
  public boolean isElderly() {
    return this.age > 65;
  }

  public boolean isChild() {
    return this.age < 18;
  }

  // ! Static Method
  // 1. input (age) -> output (boolean)
  public static boolean isElderly2(int age) {
    return age > 65;
  }

  // why it can be instance method?
  // public int sum(int x, int y) -> method要：sysout(new DemoXXX.sum(xxx,xxx))
  public static int sum(int x, int y) {
    return x + y;
  }
  public static void main(String[] args) {
    DemoStaticMethod dsm = new DemoStaticMethod(10);
    System.out.println(dsm.getAge());
    System.out.println(dsm.age);
    System.out.println(dsm.isElderly());
    System.out.println(dsm.isChild());

    System.out.println(DemoStaticMethod.isElderly2(70));
    System.out.println(dsm.isElderly2(70));
    
    System.out.println(dsm.sum(1, 2));
  }
}
