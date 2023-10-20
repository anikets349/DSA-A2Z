import java.util.Scanner;

public class CheckPalindrome {
    public static boolean helper(int i, int n, String str) {
        if (i > n / 2)
            return true;
        if (str.charAt(i) != str.charAt(n - i - 1))
            return false;
        return helper(i + 1, n, str);
    }

    public static boolean checkPalindrome(String str) {
        return helper(0, str.length(), str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkPalindrome(str));
        sc.close();
    }
}
