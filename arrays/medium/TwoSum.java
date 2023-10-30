import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // O(N^2) time, O(1) space
    public static int[] twoSumBrute(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] + arr[j] == target) {
                        return new int[] { i, j };
                    }
                }
            }
        }
        return new int[] { -1, -1 };
    }

    // O(N) time, O(N) space
    public static int[] twoSumBetter(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            if (map.containsKey(rem) && map.get(rem) != i) {
                return new int[] { i, map.get(rem) };
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSumBetter(arr, target)));
        sc.close();
    }
}
