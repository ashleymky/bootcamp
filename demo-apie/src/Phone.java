public class Phone extends Machine {
  private double version;

  public Phone(double version, int power){
    super(power);
    this.version = version;
  }

  public double getVersion() {
    return this.version;
  }

  @Override
  public void start() {
    System.out.println("Phone is starting...");
  }

  @Override
  public void stop() {
    System.out.println("Phone is stoping...");
  }
}
