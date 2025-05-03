import java.time.LocalDate;

public class Exercise {
  // testing
  public static void main(String[] args) {

    String str = "John, How are you?";
    int hi = str.length();
    char Yo = str.charAt(3);
    boolean Mo = str.isEmpty();
    boolean Moo = str.isBlank();
    String lowercase = str.toLowerCase();
    String uppercase = str.toUpperCase();
    int number = str.indexOf('a');

    LocalDate ld1 = LocalDate.of(2025, 12, 12);

    System.out.println(hi);
    System.out.println(Yo);
    System.out.println(Mo);
    System.out.println(Moo);
    System.out.println(lowercase);
    System.out.println(uppercase);
    System.out.println(number);

    System.out.println(ld1);
    System.out.println(LocalDate.of(2025, 4, 30).getMonth());
    System.out.println(LocalDate.of(2025, 10, 22).getDayOfWeek());

  }
}
