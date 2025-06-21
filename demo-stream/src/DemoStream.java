import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {

  public static void main(String[] args) {
    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("Petter", 8));
    dogs.add(new Dog("Janvier", 12));
    dogs.add(new Dog("Jeho", 2));
    dogs.add(new Dog("Den", 10));

    // Prepare a new arraylist contains dogs with age >= 8
    // ! Filtering - for-each
    List<Dog> newDogs = new ArrayList<>();
    for (Dog dog : dogs) {
      if (dog.getAge() >= 8) {
        newDogs.add(dog);
      }
    }
    System.out.println(newDogs);
  

  // ! Filtering - Stream
  // List -> Stream （以下係詳細版）
  Stream<Dog> newDogs2 = dogs.stream(); // LIST.STREAM
  // Use filter() in Stream<>
  // use predicate
  Stream<Dog> newDogs3 = newDogs2.filter(d -> d.getAge() >= 8); // 代替if loop
  // From Stream<Dog> to List<Dog>
  List<Dog> newDogs4 = newDogs3.collect(Collectors.toList());

  System.out.println(newDogs4);

  List<Dog> newDogs5 = dogs.stream() // 等於上面
      .filter(d -> d.getAge() >= 8).collect(Collectors.toList());

  System.out.println(newDogs5);

  // Dog name starts with "D"

  List<Dog> newDogs6 = dogs.stream().filter(d -> d.getName().startsWith("D"))
      .collect(Collectors.toList());

  System.out.println(newDogs6);

  // name length > 3 and age < 8
  // ! filter supports AND OR

  List<Dog> newDogs7 =
      dogs.stream().filter(d -> d.getName().length() > 3 && d.getAge() < 8) // ! Predicate
          .collect(Collectors.toList());

  System.out.println(newDogs7);

  // ! Traditional way to get dog names
  // List<Dog> -> List<String> ===> converison of type
  List<String> names = new ArrayList<>();
  for(Dog d:dogs)
  {
    names.add(d.getName());
  }System.out.println(names);


  // ! map - Stream
  // List<Dog> -> List<String> ===> converison of type
  List<String> names2 = dogs.stream().map(d -> d.getName()) // ! Function<Dog, String>
      .collect(Collectors.toList());System.out.println(names2);

  // ! Stream - filter + map
  // find all dog names, whose age > 9
  List<String> name3 =
      dogs.stream().filter(dog -> dog.getAge() > 9).map(dog -> dog.getName())
          .collect(Collectors.toList());
          System.out.println(name3);

  // ! Example : Staff, filter + map + for-each

  List<Staff> staffs = new ArrayList<>();
  staffs.add(new Staff("John", LocalDate.of(2024, 1, 20), "john@mail.com"));
  staffs.add(new Staff("Mary", LocalDate.of(2000, 3, 20), "mary@mail.com"));
  staffs.add(new Staff("Zen", LocalDate.of(2019, 10, 20), "zen@mail.com"));
  // find the staffs, who are with 10+ exp, and then print out their email address

  staffs.stream() 
  .filter(s -> s.yearOfExp() >= 10) 
  .map (s -> s.getEmail()) // Stream<String>
  .forEach(email -> {
    System.out.println("Email address: " + email);
  });

  // Collections.sort() -> Comparator
  // You can use  "->" to create an object, when you have an interface with 1 abstract method only.
  Comparator<Staff> sortByYearOfExp = 
  (staff1, staff2) -> staff1.yearOfExp() < staff2.yearOfExp() ? -1 : 1;
  
  // sort() -  Stream
  List<String> emails = staffs.stream()
  .sorted(sortByYearOfExp)
  .map( s -> s.getEmail())
  .collect(Collectors.toList());
  System.out.println(emails);

     // Stream - filter + count
     long result =
     staffs.stream().filter(s -> s.getEmail().length() > 10).count();
 System.out.println(result);

 long result2 = staffs.stream() //
     .map(s -> {
       System.out.println(s.getEmail()); 
       // ! print out? NO, because map() won't affect result of count. 
       // ! So the process won't trigger the logic of map().
       return s.getEmail();
     }).count();
 System.out.println(result2); // 3

 // ! Stream -> terminal operation (collect, count, foreach, etc)
 // which intermediate operation affect result

 // Create Stream Object
 Stream<Integer> integers = Stream.of(3, 100, -2);
 Stream<Staff> staffs2 = Stream.empty(); // new ArrayList<>()

 // Given: List<String>, Vincent, Lucas, Oscar
 // Output: List<Dog>, assume all dogs are at age 1
}


  public static class Staff {
    private String name;
    private LocalDate joinDate;
    private String email;

    public Staff(String name, LocalDate joinDate, String email) {
      this.name = name;
      this.email = email;
      this.joinDate = joinDate;
    }

    // Presentation of joinDate
    public int yearOfExp() {
      return LocalDate.now().getYear() - this.joinDate.getYear();
    }

    public String getEmail() {
      return this.email;
    }
  }

  public static class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public int getAge() {
      return this.age;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return "Dog(" + "name = " + this.name + "; age = " + this.age + ")";
    }

  }
}

