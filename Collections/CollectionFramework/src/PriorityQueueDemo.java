import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        pq.offer(2);
        pq.offer(3);
        pq.offer(4);
        pq.offer(-7);

        System.out.println(pq);
    }
}
