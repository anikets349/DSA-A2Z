import java.util.Scanner;
import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static int partitionArr(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low, j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    // O(NlogN) time, O(1) space
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIdx = partitionArr(arr, low, high);
            quickSort(arr, low, partitionIdx - 1);
            quickSort(arr, partitionIdx + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
