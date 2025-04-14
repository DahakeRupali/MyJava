import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maptypes_Demo {
    public static void main(String[] args) {
        // Creating the Map to store student roll numbers and names

        // HashMap: Stores the students without any specific order
        Map<Integer, String> studentRollHashMap = new HashMap<>();
        studentRollHashMap.put(105, "John");
        studentRollHashMap.put(108, "Alice");
        studentRollHashMap.put(101, "Bob");
        studentRollHashMap.put(1011, "Messi");

        // TreeMap: Stores the students sorted by roll number (natural ordering of Integer)
        Map<Integer, String> studentRollTreeMap = new TreeMap<>();
        studentRollTreeMap.put(103, "John");
        studentRollTreeMap.put(101, "Alice");
        studentRollTreeMap.put(100, "Bob");

        // LinkedHashMap: Maintains the insertion order of the entries
        Map<Integer, String> studentRollLinkedHashMap = new LinkedHashMap<>();
        studentRollLinkedHashMap.put(105, "John");
        studentRollLinkedHashMap.put(1022, "Alice");
        studentRollLinkedHashMap.put(1031, "Bob");

        // Displaying the HashMap
        System.out.println("HashMap (Unordered):");
        for (Map.Entry<Integer, String> entry : studentRollHashMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Displaying the TreeMap (sorted by roll number)
        System.out.println("\nTreeMap (Sorted by Roll Number):");
        for (Map.Entry<Integer, String> entry : studentRollTreeMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Displaying the LinkedHashMap (preserves insertion order)
        System.out.println("\nLinkedHashMap (Insertion Order):");
        for (Map.Entry<Integer, String> entry : studentRollLinkedHashMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
