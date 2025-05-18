public class Student {
    // Student -> receive (Candy candy)
    private static int counter = 0;
    private int ID;
    private Candy[] candies;

    public Student() {
        this.ID = counter++;
        this.candies = new Candy[0];
    }

    public int getID() {
        return this.ID;
    }

    public Candy[] getCandies() {
        return this.candies;
    }

    public int numberOfCandy() {
        return this.candies.length;
    }

    public int getTotalNumbers() {
        int sum = 0;
        for (int i = 0; i < this.candies.length; i++) {
            sum += this.candies[i].getNumber();
        }
        return sum;
    }

    public int numberOfRed() {
        int count = 0;
        for (int i = 0; i < this.candies.length; i++) {
            if (this.candies[i].getColor().equals("Red")) {
                count++;
            }
        }
        return count;
    }

    public void receive(Candy candy) {
        Candy[] newCandies = new Candy[this.candies.length + 1];
        for (int i = 0; i < this.candies.length; i++) {
            newCandies[i] = this.candies[i];
        }
        newCandies[newCandies.length - 1] = candy;
        this.candies = newCandies;
    }
}
