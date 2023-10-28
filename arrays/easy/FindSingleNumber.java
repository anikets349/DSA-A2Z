import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class FindSingleNumber {
    /*
     * Approach 1 - Brute
     * For each element in the array run a for loop and count its occurrence
     * Return the element whose occurrence count is 1
     * O(N^2) time, O(1) space
     * 
     * Approach 2 - Better
     * Use a hashmap to store the occurrence of every element
     * Iterate over the hashmap and return the element having occurrence = 1
     * O(N) time, O(N) space
     * 
     * Approach 3 - Optimal
     * XOR of two elements is always 0
     * XOR of all array elements will give us the element occurring once
     * As all elements occur twice except for one
     * O(N) time, O(1) space
     */

    // O(N^2) time, O(1) space
    public static int singleNumberBrute(int[] arr) {
        int n = arr.length, ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                ans = arr[i];
                break;
            }
        }
        return ans;
    }

    // O(N) time, O(N) space
    public static int singleNumberBetter(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.replace(nums[i], map.get(nums[i]) + 1);
            }
        }
        int ans = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans = entry.getKey();
                break;
            }
        }
        return ans;
    }

    // O(N) time, O(1) space
    public static int singleNumberOptimal(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(singleNumberOptimal(arr));
        sc.close();
    }
}
