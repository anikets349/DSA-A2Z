import java.util.Set;
import java.util.HashSet;

/*
 * HashSet is an unordered data structure
 * LinkedHashSet is an ordered data structure
 * TreeSet uses BST to implement a set, is ordered
 * Methods:
 * add
 * remove
 * size
 * isEmpty
 * contains
 * clear
*/

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        System.out.println(set);

        set.add(1);
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);

        System.out.println(set);
    }
}
