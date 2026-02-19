import java.util.Queue;
import java.util.LinkedList;
public class QueueExm {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Elements of queue: " + queue);
        System.out.println("Head of queue: " + queue.peek());
        System.out.println("Removing head of queue: " + queue.poll());
        System.out.println("Elements of queue after poll: " + queue);
    }
}
