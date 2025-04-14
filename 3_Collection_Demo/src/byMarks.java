import java.util.Comparator;

public class byMarks implements Comparator<Student> {
	
	
	 // Comparator to sort by marks
 
        @Override
        public int compare(Student s1, Student s2) {
        	
        	
            return s1.marks - s2.marks;  // Sort by marks in ascending order
        }
    
}
