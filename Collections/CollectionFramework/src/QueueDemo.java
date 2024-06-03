import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);
    }
}
