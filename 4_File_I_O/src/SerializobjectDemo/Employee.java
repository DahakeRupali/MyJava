package SerializobjectDemo;

import java.io.Serializable;

public class Employee implements Serializable {
    int empId;
    String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
}
