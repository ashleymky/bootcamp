public class DemoSwitchExpression {
  
  public static void main(String[] args) {
    // switch is a bad idea
    // 1. you have to remember to break
    // 2. no range checking
    // 3. eye ball check if all values has been covered
    // 4. Not allowed to do "AND OR"

    Currency currency = Currency.USD;
    if (currency == Currency.HKD) {

    } else if (currency == Currency.USD) {

    } else if (currency == Currency.CNY) {

    }

    // Switch expression
    // 1) Avoid Duplicate case
    // 2) Java 21: missing case -> warning; Java 17: missing value -> error
    // 3) default case is allowed, but you can ignore

    Currency amountCurrency = Currency.USD;
    double amount = 10.0;
    double amountInHKD = switch (amountCurrency) {
      case HKD -> amount * 1.0; // return
      case USD -> amount * 7.8; // return
      case CNY -> amount * 1.1; // return
    };
    // switch (currency) {
    //   case HKD -> System.out.println("HK DOLLAR");
    //   case USD -> System.out.println("US DOLLAR");
    //   case CNY -> System.out.println("CHN DOLLAR");
    // }
  }

  public static enum Currency {
    HKD, USD, CNY;
  }
}

