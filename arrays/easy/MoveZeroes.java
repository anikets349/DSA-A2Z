import java.util.Scanner;
import java.util.Arrays;

public class MoveZeroes {
    /*
     * Approach 1 - Brute
     * Declare a new array whose length == array length
     * Use a variable to count the number of zeroes
     * Iterate over the array
     * If the element is non-zero, move it to the new array, increment idx
     * If the element is a zero, increment the counter of zeroes
     * Once done, for the number of zero times add 0 into the new array
     * Iterate over the new array and copy its elements into the original array
     * O(N) time, O(N) space
     * 
     * Approach 2 - Optimal
     * Two pointer approach - j and i
     * Initialize j to -1
     * Use i to find the first zero in the array, once found update j to i
     * Start iterating from j + 1 index to length of array
     * If the element is a non-zero element, swap with j and increment j
     * O(N) time, O(1) space
     */

    // O(N) time, O(N) space
    public static void moveZeroes(int[] arr) {
        int[] ans = new int[arr.length];
        int numZeroes = 0, j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                numZeroes++;
            } else {
                ans[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < numZeroes; i++) {
            ans[j] = 0;
            j++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    // O(N) time, O(1) space
    public static void moveZeroesBetter(int[] arr) {
        int n = arr.length, j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1)
            return;
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, j, i);
                j++;
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
        moveZeroesBetter(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
