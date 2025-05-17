public class Account {

  // Attributes
  private String userId;
  private double balance;

  // ! can be >1 constructors
  // Constructor 唔打出黎都存在 = no return type (vice versa)
  public Account() { //empty constructor (no parameter)
    // ! empty constructor implicitly exists (When there is no constructor)
    this.balance = 10.0;
  }

  // All arguments constructors (All parameters)
  public Account(String userId, double balance) {
    this.userId = userId;
    this.balance = balance;
  }

  // ! write
  public void setBalance(double balance) {
    this.balance = balance;
  }

  // ! read
  public double getBalance() {
    return this.balance;
  }

  public static void main(String[] args) {
    Account[] accounts = new Account[3]; // create Account Array Object
    Account a1 = new Account();
    Account a2 = new Account();
    a2.setBalance(800.0);
    Account a3 = new Account();

    accounts[0] = a1;
    accounts[1] = a2;
    accounts[2] = a3;

    System.out.println(accounts[1].getBalance()); // 800.0
    // System.out.println(accounts[0].getBalance()); =/= 0.0 // ! error ->因冇set object, null
    System.out.println(accounts[0].getBalance());

    String[] names = new String[3];
    String s1 = "John";
    names[0]= s1;
    System.out.println(names[0]);
  }

  
}
