public class Customer {
  private Order[] orders; // !
  private String name;
  private long ID;

  // main()
  // John -> many orders -> items
  public Customer(String name, long ID) {
    this.name = name;
    this.ID = ID;
  }

  public Customer() {
    this.orders = new Order[0]; // array object, 未開單＝0
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public long getID() {
    return this.ID;
  }

  // !
  public void add(Order newOrder) {
    Order[] newOrders = new Order[this.orders.length + 1]; // array object 才可.length
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = orders[i];
    }
    newOrders[newOrders.length - 1] = newOrder;
    this.orders = newOrders;
  }


  // isVIP():
  // total amount of orders > 100_000
  public boolean isVIP() {
    double total = 0.0;
    for (int i = 0; i < this.orders.length; i++) {
      total += this.orders[i].checkoutAmount();
    }
    // if (total > 100_000) {
    // return true;
    // }
    // return false;
    return total > 100_000;
  }


  public static void main(String[] args) {

    Customer c1 = new Customer(); // call constructor : Customer()
    c1.setName("John");
    Item itemA = new Item(10.9, 2);
    Item itemB = new Item(11, 3);
    Order orderA = new Order(itemA); // !
    orderA.add(itemB);
    c1.add(orderA);

    System.out.println(c1.isVIP());

  }

}
