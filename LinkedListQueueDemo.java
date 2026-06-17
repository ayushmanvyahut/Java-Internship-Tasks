import java.util.LinkedList;

public class LinkedListQueueDemo {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        // Enqueue (Add elements)
        queue.add("Ayushman");
        queue.add("Rahul");
        queue.add("Priya");

        System.out.println("Queue after enqueue operations:");
        System.out.println(queue);

        // Dequeue (Remove first element)
        String removed = queue.remove();

        System.out.println("Dequeued Element: " + removed);

        System.out.println("Queue after dequeue operation:");
        System.out.println(queue);

        // Front element
        System.out.println("Front Element: " + queue.peek());
    }
}