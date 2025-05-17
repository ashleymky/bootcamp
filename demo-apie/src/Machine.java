public abstract class Machine {
  private int power;
  private boolean isOn;

  public Machine(int power) {
    this.power = power;
  }

  public int getPower() {
    return this.power;
  }

  public Machine() {
    this.isOn = false; //唔寫＝default false
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
    Machine phone = new Phone(10, 1);
    System.out.println(phone.getPower());
    phone.start();
    phone.stop();
    Machine Laptop =  new Laptop(240, 3);
    System.out.println(Laptop.getPower());
    Laptop.start();
    Laptop.stop();

    Phone p2 = new Phone(11, 2);
    System.out.println(p2.getVersion());
    Laptop l2 = new Laptop(144, 10);
    System.out.println(l2.getPower());
    };
  }






