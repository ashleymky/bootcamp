public class Order {
  // checkoutAmount
  // private double[] prices;
  // private double[] quantities;

  // Alternative
  private Item[] items;

// public Order() {
// this.items = new Item[0];
// }

  public Order (Item item) {
    this.items = new Item[1];
    this.items[0] = item;
}

  //! difficult!
  public void add(Item newItem) {  // 之後可用Item newItem
    Item[] newItems = new Item[this.items.length + 1]; // 將newItem變新array
 for (int i = 0; i < this.items.length; i++) {
  newItems[i] = items[i]; // 將舊array copy去 新array
 }
 newItems[newItems.length - 1] = newItem; //將新資料寫入新array最後一個位置
 this.items = newItems; //新array 變 舊array
  }

  //BigDecimal
  // ! Item.java owns price & quantity (attribute), so Item has to present price & quantity
  public double checkoutAmount() {
    double total = 0.0;
    for (int i = 0; i < this.items.length; i++) {
      total += this.items[i].subtotal();
    }
    return total;
  }

  public static void main(String[] args) {
    Item itemA = new Item(99, 2);

    Order order = new Order(itemA); // array length = 0

    order.add(itemA); // array length = 1

    Item itemB = new Item(14, 3);
    order.add(itemB); // array length = 2

    System.out.println(order.checkoutAmount()); // 240.0
  }



}
