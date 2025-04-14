// Encapsulation

public class Encap_Person {
	// Private data members
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    //this refers to the current object — the instance whose method or constructor called.
    // Diffrentiate  instance variables and parameters
    public void setName(String name) {
        this.name = name;// 'this.name' is the instance variable, 'name' is the parameter
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) { // Ensuring valid age
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

}
