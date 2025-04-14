
import java.util.*;

public class ListDemo_StudentEnrollSystem {
    public static void main(String[] args) {
        // 1. Using List to store available subjects (allow duplicates)
        List<String> subjectList = new ArrayList<>();
        subjectList.add("Mathematics");
        subjectList.add("Science");
        subjectList.add("History");
        subjectList.add("English");
        subjectList.add("Computer Science");
        subjectList.add(1, "A");
        System.out.println("A addedd");
     // we can remove items by remove 
        //Contains and isempty operation 
        if (subjectList.contains("A"))
        	System.out.println("A is Avalble ");
       if  (subjectList.isEmpty())
    	   System.out.println("List is Empty");

        // Print all available subjects
        System.out.println("Available Subjects:");
        for (String subject : subjectList) {
            System.out.println(subject);
        }
        //Size operation 
        System.out.println("Size =" + subjectList.size());
        
        System.out.println("\n---");
        
        //Sort operation 
        System.out.println("Sorted List ");
        
        subjectList.sort(null);
        System.out.println("Available Subjects:");
        for (String subject : subjectList) {
            System.out.println(subject);
        }

        System.out.println("\n---");

        // 2. Using Set to store courses a student has applied for (no duplicates allowed)
        Set<String> coursesApplied = new HashSet<>();
        coursesApplied.add("Mathematics");
        coursesApplied.add("Science");
        coursesApplied.add("Computer Science");
        coursesApplied.add("Mathematics"); // Duplicate, won't be added

        // Print the courses the student applied for
        System.out.println("Courses Applied (Duplicates not allowed):");
        for (String course : coursesApplied) {
            System.out.println(course);
        }

        System.out.println("\n---");

        // 3. Using Map to store student's roll number and name
        Map<Integer, String> studentRollMap = new HashMap<>();
        studentRollMap.put(101, "John");
        studentRollMap.put(102, "Alice");
        studentRollMap.put(103, "Bob");

        // Print student's roll numbers and names
        System.out.println("Student Roll Number and Name:");
        studentRollMap.forEach((rollNo, name) -> 
        System.out.println("Roll No: " + rollNo + ", Name: " + name));

        
    }
}
