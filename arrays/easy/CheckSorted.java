import java.util.Scanner;

public class CheckSorted {
    /*
     * Approach 1
     * Start from the first element
     * Check if the element is smaller than the next element
     * If not return false - array is not sorted
     * If entire array is traversed, return true - array is sorted
     * O(N) time, O(1) space
     */

    // O(N) time, O(1) space
    public static boolean isSorted(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr, n));
        sc.close();
    }
}
