package practical_1a;

class Student {

    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor 
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method Overloading 
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method Overloading 
    void display(String course) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    // Static Method
    static void collegeName() {
        System.out.println("College: MVLU COLLEGE");
    }
}

// Main Class
public class ConstructorOverloadingDemo {

    public static void main(String[] args) {

        
        Student.collegeName();

        Student s1 = new Student();
        Student s2 = new Student("Ananya", 19);

        System.out.println("\nStudent 1 Details");
        s1.display();

        System.out.println("\nStudent 2 Details");
        s2.display("Computer Science");
    }
}
