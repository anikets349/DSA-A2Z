import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.println(pq);

        pq.offer(12);
        pq.offer(-2);
        pq.offer(7);
        pq.offer(6);
        pq.offer(15);

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
