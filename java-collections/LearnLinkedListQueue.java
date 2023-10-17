import java.util.Queue;
import java.util.LinkedList;

/*
 * Methods:
 * offer
 * poll
 * peek
 * size
 * isEmpty
 * add --> adjacent method of offer, throws exception
 * remove --> adjacent method of poll, throws exception
 * element --> adjacent method of peek, throws exception
*/

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        System.out.println(queue);

        // insert elements into the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println(queue);

        // remove elements from queue
        while (!queue.isEmpty()) {
            System.out.println(queue.poll() + " removed from queue");
            System.out.println(queue);
        }

        queue.offer(1);
        queue.offer(3);
        queue.offer(5);
        queue.offer(7);
        queue.offer(9);
        queue.offer(11);

        System.out.println(queue);

        // check element at the front end of the queue
        System.out.println(queue.peek());
    }
}
