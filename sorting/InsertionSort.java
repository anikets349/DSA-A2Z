import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {
    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void insertionSortRecursive(int[] arr, int n, int i) {
        if (i == n)
            return;
        for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
            swap(arr, j - 1, j);
        }
        insertionSortRecursive(arr, n, i + 1);
    }

    // O(n^2) in worst, avg, O(n) time in best, O(1) space
    public static void insertionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
                swap(arr, j - 1, j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);
        // insertionSortRecursive(arr, n, 0);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}