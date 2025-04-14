import java.util.*;

public class List_all_imple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // 1. ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // 2. LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Fox");
        System.out.println("LinkedList: " + linkedList);

        // 3. Vector
        List<String> vector = new Vector<>();
        vector.add("Google");
        vector.add("Microsoft");
        vector.add("Apple");
        System.out.println("Vector: " + vector);

        // 4. Stack (LIFO)
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("Stack before pop: " + stack);
        stack.pop();  // Removes "Third"
        System.out.println("Stack after pop: " + stack);

        // 5. Iterating all lists using for-each
        System.out.println("\nAccessing ArrayList:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        System.out.println("\nAccessing  LinkedList:");
        for (String item : linkedList) {
            System.out.println(item);
        }

        System.out.println("\nAccessing  Vector:");
        for (String item : vector) {
            System.out.println(item);
        }

        System.out.println("\nAccessing Stack:");
        for (String item : stack) {
            System.out.println(item);
        }

	}

}
