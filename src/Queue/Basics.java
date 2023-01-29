package Queue;
import java.util.*;

public class Basics {
    public static void main(String[]args) {
        Queue<String> queue = new LinkedList<>();
        //Queue is not a class its and interface so we used linkedlist class
        queue.offer("Shrayash");
        queue.offer("Shahil");
        queue.poll();
        System.out.println(queue);
        //Note
        // Queue = FIFO data structure. First-In First-Out
        //         A collection designed for holding elements prior to processing
        //          Linear data structure

        //      enqueue = offer()
        //      dequeue = poll()

        // Where are queues useful?
        // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search
    }
}
