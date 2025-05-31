// Base class Person
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Subclass Employee
class Employee extends Person {
    String employeeID;
    double salary;

    // Constructor using super to initialize Person attributes
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age); // initialize name and age from Person class
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create Employee object
        Employee emp = new Employee("Alice", 30, "E123", 55000.0);
        
        // Display Employee details
        emp.displayDetails();
    }
}
