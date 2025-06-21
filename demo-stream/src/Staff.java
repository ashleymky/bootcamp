// ! Java 16 record
public record Staff(String name, int age) {
  // private String name;
  // private String age;

  // public Staff(String name, String age) {
  //   this.name = name;
  //   this.age = age;
  // }

  // public String getName() {
  //   return this.name;
  // }

  // public int getAge() {
  //   return this.age;
  // }

  // no setter

  // scenario:  get data from database, and then sent it over to your client

  // customer instance method (Presentation)

  public String nickName() {
    return "Pig" + this.name;
  }

}
