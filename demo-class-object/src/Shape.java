public class Shape {
  private static int counter = 0;
  private static final double PI = 3.14159 ; // constant , 不會再改
  // final ->, finalized
  private final String name = "John";
  private String color; // attribute (usualy we have setter, becasuse it is not final)

  public Shape() {

  }
  public String getName() {
    return this.name;
  }


  public static void main(String[] args) {
    System.out.println(Shape.PI);
    // ! because Shape.PI is a "final" variable, so cannot be modified.
    // Shape.PI += 1;
    Shape.counter++;
    System.out.println(counter += 1); 
    System.out.println(Shape.counter); 

    new Shape().counter++; // Not recommended
    Shape.counter++;  // Normal usage
    System.out.println(Shape.counter); 
    System.out.println(new Shape().getName());

    // print John

    Shape s1 = new Shape();
    System.out.println(s1.getName());

  }


}
