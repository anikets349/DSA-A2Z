// Return the length of the longest subarray with sum k
// Array contains both positive, negative numbers

import java.util.Scanner;
import java.util.HashMap;

public class LongestSubArrWithSumK_PN {
    // O(N^2) time, O(1) space
    public static int getLongestSubarrayLenBrute(int[] arr, int k) {
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    /*
     * Optimal Approach
     * Consider an array whose sum = x
     * If you want to find a subarray with sum = k
     * The sum of the remaining array should be equal to x - k
     * For a subarray with sum k you there should be someone with sum = x - k
     */
    // O(N) time, O(1) space
    public static int getLongestSubarrayLenOptimal(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            int rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(getLongestSubarrayLenOptimal(arr, k));
        sc.close();
    }
}
