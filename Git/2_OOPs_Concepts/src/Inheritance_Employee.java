
// Base class
class Inheritance_Employee{
    String name;
    int id;
    double salary;

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

// Derived class
class Inherited_Manager extends Inheritance_Employee{
    int teamSize;

    void manageTeam() {
        System.out.println(name + " manages a team of " + teamSize + " people.");
    }
}