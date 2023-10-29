import java.util.Scanner;

public class LongestSubArrWithSumK {
    // O(N^2) time, O(1) space
    public static int longestSubarrayWithSumKBrute(int[] a, int k) {
        int n = a.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                if (sum > k)
                    break;
                else if (sum == k) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }

    // O(N) time, O(1) space
    public static int longestSubarrayWithSumKOptimal(int[] a, int k) {
        int n = a.length, maxLen = 0;
        int left = 0, right = 0;
        long sum = a[left];
        while (right < n) {
            while (left < right && sum > k) {
                sum -= a[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n)
                sum += a[right];
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
        System.out.println(longestSubarrayWithSumKOptimal(arr, k));
        sc.close();
    }
}
