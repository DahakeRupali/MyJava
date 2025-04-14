
import java.util.*;

// Student class implements Comparable
class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;

    // Constructor
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Implement compareTo() to compare students by ID
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);  // Sort by ID in ascending order
    }

    @Override
    public String toString() {
        return id + " "+ name + " (" + marks + ")";
    }
}

public class SortList_Comparable_comparator {
    private static Comparator byName;

	public static void main(String[] args) {
        // Create a list of students
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3, "Ravi", 80));
        studentList.add(new Student(1, "Anita", 90));
        studentList.add(new Student(2, "Karan", 75));

        // Sort students by ID using Comparable
        Collections.sort(studentList);

        System.out.println("Sorted by ID (using Comparable- as it is default sorting):");
        for (Student s : studentList) {
            System.out.println(s);
        }

       

        // Sort students by marks using Comparator
        Collections.sort(studentList, new byMarks());

        System.out.println("\nSorted by Marks (using Comparator):");
        for (Student s : studentList) {
            System.out.println(s);
        }
        

		
		 // Sort students by name using Comparator
       Collections.sort(studentList, byName);

        System.out.println("\nSorted by Name (using Comparator):");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
