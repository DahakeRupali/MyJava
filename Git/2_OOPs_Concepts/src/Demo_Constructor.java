
class Student {
    String name;
    int age;

    // Overloaded Constructor 1: Default constructor (no parameters)
    Student() {
        name = "Not Assigned";
        age = 0;
        System.out.println("Default Constructor Called");
    }

    // Overloaded Constructor 2: Parameterized constructor
    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
        System.out.println("Parameterized Constructor Called");
    }
    // Copy Constructor
    Student(Student s) {
        this(s.name, s.age);  // Constructor chaining
        System.out.println("Copy Constructor called");
    }
 // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Demo_Constructor {
    public static void main(String[] args) {
        // Using default constructor
        Student student = new Student();
        student.displayDetails();

        // Using parameterized constructor
        Student student1 = new Student("Siya", 25);
        student1.displayDetails();
        
        //Using copy Constror
        Student student2 = new Student(student1);      // Copy constructor used
        
        System.out.println("Copied Student:");
        student2.displayDetails();
    }
}
