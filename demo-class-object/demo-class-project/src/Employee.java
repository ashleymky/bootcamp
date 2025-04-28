public class Employee {

    //Attributes
    private String name;
    private int age;
    private String email;

    // Object Method (Instance Method)
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    // Runtime
    public static void main(String[] args) {
        // Problem
        String employee1Name = "John";
        int employee1Age = 26;
        String employee1Email = "John@gmail.com";

        String employee2Name = "Steven";
        int employee2Age = 28;
        String employee2Email = "Steven@gmail.com";

        // Solution - Class and Object
        Employee e1 = new Employee();
        e1.setName("John");
        System.out.println(e1.getName()); // "John"

        e1.setAge(26);
        System.out.println(e1.getAge()); // "26"

        e1.setEmail("john@gmail.com");
        System.out.println(e1.getEmail());

    }
}
