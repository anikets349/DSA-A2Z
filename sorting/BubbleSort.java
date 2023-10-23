import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void bubbleSortRecursive(int[] arr, int n) {
        if (n == 1)
            return;
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
            }
        }
        bubbleSortRecursive(arr, n - 1);
    }

    // O(n^2) time in worst, O(n) time in best, O(1) space
    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean didSwap = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    didSwap = true;
                }
            }
            if (!didSwap)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSortRecursive(arr, n);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
