import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DataStructureExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    ArrayList<Integer> IntNum = new ArrayList<>();
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    IntNum.add(10);
    IntNum.add(20);
    IntNum.add(30);
    IntNum.add(40);
    IntNum.add(50);    
    // 1c. Print all the elements in the list.
    System.out.println(IntNum);
    // 1d. Remove the number 30 from the list.
    IntNum.remove(2);
    // 1e. Print the size of the list.
    System.out.println(IntNum.size());
    System.out.println(IntNum);

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    ArrayList<String> FruitExercise = new ArrayList<>();
    FruitExercise.add("Apple");
    FruitExercise.add("Banana");
    FruitExercise.add("Mango");
    FruitExercise.add("Orange");

    // 2b. Check if "Grapes" exists in the list.
    Boolean Grapes = FruitExercise.contains("Grapes");
    System.out.println(Grapes);
    // 2c. If it doesn’t exist, add it to the list.
    FruitExercise.add("Grapes");
    // 2d. Update "Mango" to "Peach".
    FruitExercise.set(2, "Peach");
    // 2e. Print the final list.
    System.out.println(FruitExercise);

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    ArrayList<Integer> Num1 = new ArrayList<>();
    Num1.add(10);
    Num1.add(20);
    Num1.add(10);
    Num1.add(30);
    Num1.add(40);
    Num1.add(20);
    Num1.add(50);
    // 3b. Remove duplicates from the list using a HashSet.
    HashSet<Integer> Num2 = new HashSet<>(Num1);
    ArrayList<Integer> Num3 = new ArrayList<>(Num2);
    // 3c. Print the list after removing duplicates.
    System.out.println(Num3);

    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    HashSet<String> Country = new HashSet<>();
    Country.add("USA");
    Country.add("India");
    Country.add("China");
    Country.add("Japan");
    // 4b. Add "Canada" to the set.
    Country.add("Canada");
    // 4c. Add "India" again. Print the result.
    Country.add("India");
    // 4d. Print all elements in the set.
    System.out.println(Country);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    HashSet<Double> Number1 = new HashSet<>();
    Number1.add(1.1);
    Number1.add(2.2);
    Number1.add(3.3);
    Number1.add(4.4);
    Number1.add(5.5);
    // 5b. Check if the set contains the number 3.3
    boolean check3pt3 = Number1.contains(3.3);
    System.out.println(check3pt3);
    // 5c. Remove the number 2.2 from the set.
    Number1.remove(2.2);
    // 5d. Print the size of the set.
    System.out.println(Number1);
    System.out.println(Number1.size());

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();
    // 6b. Set 1: 10, 20, 30, 40
    set1.add(10);
    set1.add(20);
    set1.add(30);
    set1.add(40);

    // 6c. Set 2: 30, 40, 50, 60
    set2.add(30);
    set2.add(40);
    set2.add(50);
    set2.add(60);

    // 6d. Find the common numbers of the two sets.
    for ( set1 : set2 ) {
      System.out.println("duplicated");
    }



    // 6e. Print the resulting set.

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'

    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.

  }

  public static class Student {
    private int id;
    private String name;

    // Constructor
    // getter, setter, etc.
  }
}