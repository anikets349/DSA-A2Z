import java.util.Scanner;

public class MissingNumber {
    /*
     * Approach 1 - Brute
     * Run a for loop from 0 to n
     * For each i check if it is present in the array or not
     * Use a boolean flag to check if i is present
     * Once an element is not found in the arr, break from the loop and return i
     * O(N^2) time, O(1) space
     * 
     * Approach 2 - Better
     * Declare a boolean array of size n + 1
     * Iterate through the arr and change value to true in the boolean arr (kind of
     * hash)
     * Iterate through the boolean arr, if false is found at any index return it
     * O(N) time, O(N) space
     * 
     * Approach 3 - Optimal
     * Calculate sum till N numbers using N * (N + 1)) / 2
     * Use a sum variable to find the sum of array elements
     * Return sumTillN - sum
     * O(N) time, O(1) space
     * 
     * Approach 4 - Optimal
     * Initialize two variables xor1 and xor2 to 0
     * xor1 has xor of elements from 1 to n
     * xor2 has xor of all array elements
     * xor of xor1 and xor2 will give us the missing element
     * O(N) time, O(1) space
     */

    // O(N) time, O(1) space
    public static int missingNumber(int[] arr) {
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < arr.length; i++) {
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ (i + 1);
        }
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(arr));
        sc.close();
    }
}
