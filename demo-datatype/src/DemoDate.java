import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    // 2025 4 28
    // hard to compare new/old by creating 3 int (int year, int month, int date..)

    // store date value
    // LocalDate (2014)
    LocalDate ld1 = LocalDate.of(2025, 4, 28);
    LocalDate ld2 = LocalDate.of(2025, 3, 30);
    System.out.println(ld1.isAfter(ld2)); // true
    System.out.println(ld2.isBefore(ld1)); // true
    System.out.println(ld2.isEqual(ld1)); // false

    LocalDate newDate = ld1.plusDays(7);
    System.out.println(newDate); // 2025-05-05

    System.out.println(LocalDate.of(2024, 12, 20).plusMonths(2)); //2025-02-20

    //System.out.println(LocalDate.of(2025, 1, 32));
    //LocalDate.of(2025, 1, 32); //Invalid value of DayOfMonth (valid values of date 28-31th)

    System.out.println(LocalDate.of(2025, 1, 31).minusDays(60)); //2024-12-02

    Month m1 = LocalDate.of(2025, 1 ,2).getMonth();
    System.out.println(m1.getValue()); // 1
    System.out.println(m1.toString()); // JANUARY
    System.out.println(LocalDate.of(2025, 1, 2).getYear()); // 2025
    System.out.println(LocalDate.of(2025, 4, 28).getDayOfWeek()); // Monday

    LocalDateTime dateTime = LocalDateTime.of(2025, 11, 1, 23, 59, 59);
    System.out.println(dateTime.toString()); // 2025-11-01T23:59:59

  }
}
