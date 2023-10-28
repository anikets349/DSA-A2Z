import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] arr) {
        int numOnes = 0, ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                numOnes++;
            } else {
                ans = Math.max(ans, numOnes);
                numOnes = 0;
            }
        }
        ans = Math.max(ans, numOnes);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(arr));
        sc.close();
    }
}
