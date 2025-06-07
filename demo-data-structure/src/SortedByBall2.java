import java.util.Comparator;

public class SortedByBall2 implements Comparator<Ball>{

  @Override
  public int compare(Ball o1, Ball o2) {

    if (o1.getColor() == o2.getColor()) {
      return o1.getNumber() > o2.getNumber() ? -1 : 1;
    }
    if (o1.getColor() == Ball.Color.Yellow)
    return -1;
    if (o2.getColor() == Ball.Color.Yellow)
    return 1;
    if (o1.getColor() == Ball.Color.Red)
    return -1;
    if (o2.getColor() == Ball.Color.Red)
    return 1;

    return -1;
  }
  
}
