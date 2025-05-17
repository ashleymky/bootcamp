// ! Concrete class has to 終結 (implement) abstract methods

public class Laptop extends Machine {
  private int ram;

  public Laptop (int ram, int power) {
    super(power);
    this.ram = ram;
  }

  public int getPower() {
    return this.power();
  }

  @Override
  public void start() {
    System.out.println("Laptop is starting...");
    super.turnOn();
  }

  @Override
  public void stop() {
    System.out.println("Laptop is stopping...");
    super.turnOff();
  }

  @Override
  public String getStatus() {
    return "Laptop power:" + super.getPower();
  }



}

