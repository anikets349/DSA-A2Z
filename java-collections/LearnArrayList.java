import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Methods:
 * add
 * remove
 * contains
 * size
 * indexOf
 * lastIndexOf
 * isEmpty
 * set
 * contains
*/

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        students.add("Aniket");
        System.out.println(students);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);

        numbers.add(0, 0);
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++)
            System.out.print(numbers.get(i) + " ");
        System.out.println();

        numbers.set(0, -1);
        System.out.println(numbers);

        // iterating over the list

        // 1. for loop
        for (int i = 0; i < numbers.size(); i++)
            System.out.print(numbers.get(i) + " ");
        System.out.println();

        // 2. for each loop
        for (int num : numbers)
            System.out.print(num + " ");
        System.out.println();

        // 3. iterator
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");
    }
}
