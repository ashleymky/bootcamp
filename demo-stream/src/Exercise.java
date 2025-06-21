public class Exercise {

  public static void main(String[] args) {
    
    String str = "apple, banana, cherry, date";
    String[] fruits = str.split(",\\s*");
    
    for (String fruit : fruits) {
        System.out.println(fruit);
    }
}


}
