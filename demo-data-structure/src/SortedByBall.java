
import java.util.Comparator;


public class SortedByBall implements Comparator<Ball> {

  // Yellow > Red > Blue
  @Override
  public int compare(Ball b1, Ball b2) {
    if (b1.getColor() == Ball.Color.Yellow)
      return -1;
    if (b2.getColor() == Ball.Color.Yellow)
      return 1;
    if (b1.getColor() == Ball.Color.Red)
      return -1;
    if (b2.getColor() == Ball.Color.Red)
      return 1;

    return 1;
  }

}


