// ! Once the class extends RuntimException, the class can be thrown or try-catch.
// ! RuntimeException -> unchecked Exception (optional to handle)
// ! Exception -> Checked Exception (2 ways to handle: try-catch or throws)
// RuntimeException has getMessage()
public class StaffNotFoundException extends RuntimeException{
  
  public StaffNotFoundException(String message) {
    super(message);
  }
}
