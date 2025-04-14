
import java.util.*;

public class SetImplementationsDemo {
    public static void main(String[] args) {
        // Sample data
        String[] names = {"Ravi", null,"Ayesha", "Meera", "Ravi", "Zara","Zara", null,null,null};

        // HashSet - Unordered, allows one null
        Set<String> hashSet = new HashSet<>();


        System.out.println("HashSet (Unordered, allows null):");
        System.out.println(hashSet);
        System.out.println();

        // 2 LinkedHashSet - Maintains insertion order, allows one null
        Set<String> linkedHashSet = new LinkedHashSet<>();
        for (String name : names) {
            linkedHashSet.add(name);
        }
        System.out.println("LinkedHashSet (Insertion Order, allows null):");
        System.out.println(linkedHashSet);
        System.out.println();

        // 3️ TreeSet - Sorted order (ascending), does NOT allow null
        Set<String> treeSet = new TreeSet<>();
        for (String name : names) {
            try {
                treeSet.add(name); // This will throw NullPointerException if null is added
            } catch (NullPointerException e) {
                System.out.println("TreeSet cannot accept null values");
            }
        }
        System.out.println("TreeSet (Sorted, No nulls):");
        System.out.println(treeSet);
        
        
        //operations on Set
        System.out.println(" Is it Empty ??" + hashSet.isEmpty());
        System.out.println("List contain Zara ?? " + treeSet.contains("Zara"));
        System.out.println("Size of LinkedHaAsh SEt is =" +linkedHashSet.size());
        
    }
}
