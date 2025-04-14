package Map_Sort;

public class Employee implements Comparable<Employee> {
	 int empId;
	    String name;

	    public Employee(int empId, String name) {
	        this.empId = empId;
	        this.name = name;
	    }
	// Comparable: natural order = sort by empId
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.empId, o.empId);
	}
	@Override
    public String toString() {
        return empId + " " + name;
    }

}
