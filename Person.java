class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        this.name = "Unknown";
        this.age = 18;
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
