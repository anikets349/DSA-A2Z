import java.util.Scanner;
import java.util.ArrayList;

public class RemoveDuplicatesFromSorted {
    /*
     * Approach 1 - Brute force
     * Remove duplicates from the arr in place
     * Initialize a variable prevElement
     * Iterate over the arr, if the curElement == prevElement, remove it from arr
     * If curElement != prevElement, update prevElement to curElement
     * O(N^2) time, O(1) space
     * 
     * 
     * Approach 2 - Better
     * Put all the elements of the arr into a set
     * Return the size of the set
     * O(N) time, O(N) space
     * 
     * Approach 3 - Optimal
     * Two pointers i and j
     * i is at the 0th index, j at first
     * If element at i != j, move element at j index to i + 1 index, and increment i
     * At the end, the index upto i contains all unique elements
     * So size would be i + 1
     * O(N) time, O(1) space
     */

    // O(N) time, O(1) space
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr.get(i) != arr.get(j)) {
                arr.set(i + 1, arr.get(j));
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            arr.add(element);
        }
        System.out.println(removeDuplicates(arr, n));
        sc.close();
    }
}
