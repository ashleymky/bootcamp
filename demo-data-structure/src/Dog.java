public class Dog {
  
  private String name;

  public Dog(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
  }
   if (!(obj instanceof Dog)) {
      return false;
    }
    Dog dog = (Dog) obj;
    return this.name == dog.getName();
  }

}
