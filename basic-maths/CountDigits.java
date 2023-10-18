import java.util.Scanner;

public class CountDigits {
    public static int countDigits1(int n) {
        // Approach 1 - O(n) time, O(1) space
        int num = n;
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    public static int countDigits2(int n) {
        // Approach 2 - O(1) time, space
        String str = Integer.toString(n);
        return str.length();
    }

    public static int countDigits3(int n) {
        // Approach 3 - O(1) time, space
        int ans = (int) Math.floor(Math.log10(n)) + 1;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits1(n));
        System.out.println(countDigits2(n));
        System.out.println(countDigits3(n));
        sc.close();
    }
}