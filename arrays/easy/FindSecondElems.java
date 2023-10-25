import java.util.Scanner;
import java.util.Arrays;

public class FindSecondElems {
    /*
     * Approach 1 - Brute force
     * Sort the array in increasing order
     * Return the elements at the first index and second last index
     * Works only if the array doesn't contain duplicates
     * O(NlogN) time, O(1) space
     * 
     * Approach 2 - Better
     * Iterate through the array to find the maximum element
     * Iterate through the array again to find the second maximum element
     * Repeat the same steps to find the minimum and the second minimum element
     * O(N) time, O(1) space
     * 
     * Approach 3 - Optimal
     * Use four variables two for max (first max, second max, first min, second min)
     * Initialize max variables with Integer.MIN_VALUE and min variables with
     * Integer.MAX_VALUE
     * Update the variable as per the below logic
     * O(N) time, O(1) space
     */

    // O(N) time, O(1) space
    public static int[] getSecondOrderElements(int[] arr, int n) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            // Find second maximum element
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }

            // Find second minimum element
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2 && arr[i] != min1) {
                min2 = arr[i];
            }
        }

        return new int[] { max2, min2 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = getSecondOrderElements(arr, n);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
}
