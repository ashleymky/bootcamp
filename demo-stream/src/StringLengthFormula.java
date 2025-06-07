import java.util.function.Function;

public class StringLengthFormula implements Function<> {

  @Override
  public Integer apply(String t) {
    return t.length();
  }
}
