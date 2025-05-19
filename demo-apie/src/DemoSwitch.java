public class DemoSwitch {
  

  public static void main(String[] args) {
    // loop + if

    // Alternative of "if" - switch
    int score = 85;
    char grade = ' ';
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else {
      grade = 'F';
    }
    System.out.println(grade);
  
    // Switch cannot cater "range checking" scenario
    // switch (score) {
    //  case 90:
    //    grade = A;
    //    break;


    // from Direction to degree
    Direction d1 = Direction.SOUTH;
    int degree = -1;
    // ! Switch is the best tool to manage enum checking

    switch (d1) {
      case NORTH:
        degree = 360;
        break;
        case EAST:
        degree = 90;
        break;
        case WEST:
        degree = 270;
        break;
        case SOUTH:
        degree = 180;        
        break;

    }
    System.out.println(degree);
  }

}