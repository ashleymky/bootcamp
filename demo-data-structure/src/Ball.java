import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ball {
  private Color color;
  private Integer number;

  public Ball(Color color, Integer number) {
    this.color = color;
    this.number = number;
  }
  public Color getColor() {
    return this.color;
  }

  public Integer getNumber() {
    return this.number;
  }
  public static enum Color {
    Red, Blue, Yellow;
  }

  @Override
  public String toString() {
    return "Ball(" + "color=" + this.color + ")";
  }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Color.Blue, 2));
    balls.add(new Ball(Color.Red, 3));
    balls.add(new Ball(Color.Yellow, 4));

    // sort List

    Collections.sort(balls, new SortedByBall());
    System.out.println(balls);

    // if color is same, larger number goes first
    // Yellow,9 > Yellow, 5 > Red, 1000 > Blue 10; Blue 2

    Collections.sort(balls, new SortedByBall2());
    System.out.println(balls);
  }
}
