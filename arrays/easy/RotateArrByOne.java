import java.util.Scanner;
import java.util.Arrays;

public class RotateArrByOne {
    // O(N) time, O(1) space
    public static int[] rotateArrayLeft(int[] arr, int n) {
        int[] ans = Arrays.copyOf(arr, n);
        int element = ans[0];
        for (int i = 1; i < n; i++) {
            ans[i - 1] = ans[i];
        }
        ans[n - 1] = element;
        return ans;
    }

    // O(N) time, O(1) space
    public static int[] rotateArrayRight(int[] arr, int n) {
        int[] ans = Arrays.copyOf(arr, n);
        int element = ans[n - 1];
        for (int i = n - 1; i > 0; i--) {
            ans[i] = ans[i - 1];
        }
        ans[0] = element;
        return ans;
    }

    // O(N + K) time, O(K) space
    public static int[] rotateArrayRightByK(int[] arr, int k) {
        int n = arr.length;
        int[] ans = Arrays.copyOf(arr, n);
        k = k % n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = ans[n - k + i];
        }
        for (int i = n - 1; i >= k; i--) {
            ans[i] = ans[i - k];
        }
        for (int i = 0; i < k; i++) {
            ans[i] = temp[i];
        }
        return ans;
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void reverse(int[] arr, int startIdx, int endIdx) {
        int i = startIdx, j = endIdx;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    // O(N) time, O(1) space
    public static int[] rotateRightByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = Arrays.copyOf(arr, n);
        reverse(ans, 0, n - 1);
        reverse(ans, 0, k - 1);
        reverse(ans, k, n - 1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        // int[] leftRotatedArr = rotateArrayLeft(arr, n);
        int[] rightRotatedArr = rotateRightByK(arr, k);
        // System.out.println(Arrays.toString(leftRotatedArr));
        System.out.println(Arrays.toString(rightRotatedArr));
        sc.close();
    }
}
