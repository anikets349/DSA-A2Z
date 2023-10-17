import java.util.ArrayDeque;

/*
 * Methods:
 * offer
 * offerFirst
 * offerLast
 * peek
 * peekFirst
 * peekLast
 * poll
 * pollFirst
 * pollLast
 * size
 * isEmpty
*/

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        System.out.println(adq);

        adq.offer(10);
        adq.offerFirst(5);
        adq.offerLast(15);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

        System.out.println(adq);
    }
}
