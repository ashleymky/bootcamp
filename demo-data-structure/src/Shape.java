import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Shape {
  public abstract double area();

  public static <T extends Shape> double totalArea(List<T> Shape) {
    return -1;
  }

  public static double totalArea2(List<Shape> Shape) {
    return -1;
  }
  // Circle , Rectangular
  
  public static void main(String[] args) {
    List<Shape> shapes = new LinkedList<>();
    shapes.add(new Circle());
    shapes.add(new Circle());
    shapes.add(new Rectangular());


    List<Circle> circles = new ArrayList<>();
    circles.add(new Circle());
    circles.add(new Circle());

    List<Rectangular> rectangulars = new ArrayList<>();
    rectangulars.add(new Rectangular());
    rectangulars.add(new Rectangular());

    Shape.totalArea(circles); // List<Circle>, List<Rectangular>, List<Shape>
    Shape.totalArea(rectangulars); 
    Shape.totalArea(shapes);    


    Shape.totalArea2(null); // List<Shape>
    // Shape.totalArea2(circles); 

    System.out.println(Shape.totalArea(circles));
    System.out.println(Shape.totalArea(rectangulars));    

  }

}
