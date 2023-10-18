import java.util.Scanner;

public class PalindromeNumber {
    // O(log n) time, O(1) space
    public static int reverse(int n) {
        int ans = 0;
        int num = Math.abs(n);

        while (num > 0) {
            int lastDigit = num % 10;
            ans = ans * 10 + lastDigit;
            num = num / 10;
        }

        return n < 0 ? ans * (-1) : ans;
    }

    public static boolean palindromeNumber(int n) {
        int reversedNum = reverse(n);
        return n == reversedNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palindromeNumber(n));
        sc.close();
    }
}
