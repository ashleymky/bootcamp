public abstract class Machine {
  private boolean isOn;

  // public int getPower() {
  // return this.power;
  // }

  public Machine() {
    this.isOn = false; // 唔寫＝default false
  }

  // getter
  public boolean isOn() {
    return this.isOn;
  }

  // ! Encapsulation
  // setter
  public void turnOn() {
    this.isOn = true;
  }

  public void turnOff() {
    this.isOn = false;
  }


  // abstract method
  public abstract String getStatus();

  public abstract void start();

  public abstract void stop();


  public static void main(String[] args) {
    Machine phone = new Phone(10);
    //System.out.println(phone.getPower());
    phone.start();
    phone.stop();
    System.out.println("====");
    
    Machine Laptop =  new Laptop(240);
    Laptop.start();
    Laptop.stop();

    Phone p2 = new Phone(18.5);
    System.out.println(p2.getScreenSize()); // 18.5
    System.out.println(p2.getStatus()); // Phone status: OFF
    Laptop l2 = new Laptop(24);
    System.out.println(l2.getRam()); // 24
    System.out.println(l2.getStatus()); // Laptop status: OFF
  }

}


