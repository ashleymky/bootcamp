public class Teacher {
// Teacher.java -> distribute (loop)
private Candy[] candies;

public Teacher(Candy[] candies) {
  this.candies = candies;
}

public void distrubute(Student[] student){
  int count = candies.length;
  while (--count >= 0) {
    for (int i = 0; i < students.length; i++) {
      students[i].receive(candies[count]);
      this.candies [count] = null
  }

  
  }
}

}
