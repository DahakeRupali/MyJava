import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        // 1LinkedList as Queue (FIFO behavior)
    	Queue<String> queue = new LinkedList<>();

        //  Add elements using add() and offer()
        queue.add("Ravi");        // throws exception if full
        queue.offer("Ayesha");    // returns false if full
        queue.add("Meera");

        System.out.println("Queue after add/offer: " + queue);


     //  peek(): View the head without removing
        System.out.println("peek(): " + queue.peek());

        //  element(): View the head (throws exception if empty)
        System.out.println("element(): " + queue.element());

        //  poll(): Removes and returns the head
        System.out.println("poll(): " + queue.poll());  // Ravi removed
        System.out.println("Queue after poll(): " + queue);

        //  remove(): Removes and returns head (throws exception if empty)
        System.out.println("remove(): " + queue.remove()); // Ayesha removed
        System.out.println("Queue after remove(): " + queue);

        // Final peek
        System.out.println("Final peek(): " + queue.peek());

        // Let's empty the queue to show exception behavior
        queue.remove(); // Removes Meera

        System.out.println("\nQueue is now empty: " + queue);

        // 2️ PriorityQueue (natural order sorting)
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(40);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(20);

        System.out.println("\n PriorityQueue (Natural Order):");
        while (!priorityQueue.isEmpty()) {
            System.out.println("Polled: " + priorityQueue.poll());
        }
    }
}