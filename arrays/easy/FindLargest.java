import java.util.Scanner;

public class FindLargest {
    /*
     * Brute force approach
     * Sort the array and return the last element (greatest)
     * O(NlogN) time, O(1) space
     * 
     * Optimal approach
     * Find the maximum element by comparing each element in the array
     * O(N) time, O(1) space
     */

    // O(N) time, O(1) space
    public static int largestElement(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(largestElement(arr, n));
        sc.close();
    }
}
