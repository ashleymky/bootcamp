public class MonsterEx {

  private String Pokemon;
  private int level;

  public void setName (String Pokemon) {
    this.Pokemon = Pokemon;
  }

  public String getName() {
    return this.Pokemon;
  }

  public void setLevel (int level) {
    this.level = level;
  }

  public int getLevel() {
    return this.level;
  }

public static void main(String[] args) {
  MonsterEx p1 = new MonsterEx();
  MonsterEx p2 = new MonsterEx();

  p1.setName("Pikachu");
  p2.setName("Charmander"); 
  p1.setLevel(10);
  p2.setLevel(20); // is it convenient?

  System.out.println(p1.getName());
  System.out.println(p2.getName());
  System.out.println(p1.getLevel());
  System.out.println(p2.getLevel());
  System.out.println("The combat level of " + p1.getName() + " is " + p1.getLevel());
  System.out.println("The combat level of " + p2.getName() + " is " + p2.getLevel());

}



}
