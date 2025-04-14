import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        
        // 1. Months of the Year using HashSet (unordered)
        System.out.println("Months of the Year (using HashSet - unordered):");
        Set<String> monthsHashSet = new HashSet<>(Arrays.asList(
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        ));
        monthsHashSet.forEach(System.out::println);  // prints months in no specific order

        System.out.println("\n---");
        
        // 2. Months of the Year using LinkedHashSet (maintains insertion order)
        System.out.println("Months of the Year (using LinkedHashSet - insertion order):");
        Set<String> monthsLinkedHashSet = new LinkedHashSet<>(Arrays.asList(
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        ));
        monthsLinkedHashSet.forEach(System.out::println);  // prints months in insertion order
        
        System.out.println("\n---");

        // 3. Days of the Week using TreeSet (sorted order)
        System.out.println("Days of the Week (using TreeSet - sorted):");
        Set<String> daysOfWeek = new TreeSet<>(Arrays.asList(
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", 
            "Friday", "Saturday"
        ));
        daysOfWeek.forEach(System.out::println);  // prints days in sorted order
    }
}
