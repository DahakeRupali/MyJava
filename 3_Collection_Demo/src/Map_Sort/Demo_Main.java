package Map_Sort;

import java.util.*;

public class Demo_Main {
    public static void main(String[] args) {
        // Step 1: Create Map (empId → name)
        Map<Integer, String> empMap = new HashMap<>();
        empMap.put(103, "BINA");
        empMap.put(101, "IShita ");
        empMap.put(102, "Zara");

        // Step 2: Convert Map to List of EmployeeEntry (empId and name)
        List<Employee> empList = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : empMap.entrySet()) 
        {
            empList.add(new Employee(entry.getKey(), entry.getValue()));
        }

        // Step 3: Sort using Comparable (by empId)
        Collections.sort(empList);
        System.out.println("Sorted by Employee ID (Comparable):");
        for (Employee e : empList) {
            System.out.println(e);
        }

        // Step 4: Sort using Comparator (by name)
        Collections.sort(empList, new byName());
        System.out.println("\nSorted by Employee Name (Comparator):");
        for (Employee e : empList) {
            System.out.println(e);
        }
    }
}
