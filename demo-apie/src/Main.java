class Student {
  private String id;
  private String name;

  public Student(String id, String name) {
      this.id = id;
      this.name = name;
  }
  
  @Override // Overwrite the hashCode() in Object.class
  public int hashCode() {
      return Objects.hash(this.id);
  }
}

public class Main {
  public static void main(String[] args) {
      Student s1 = new Student("1001", "Alice");
      Student s2 = new Student("1001", "Alice");

      System.out.println(s1.hashCode());  // 111
      System.out.println(s2.hashCode());  // 111
      System.out.println(s1.hashCode() == s2.hashCode()); // true
  }
}