import java.util.Scanner;

public class CheckPrime {
    // O(n) time, O(1) space
    public static boolean isPrime1(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrime2(int n) {
        // O(sqrt n) time, O(1) space
        if (n == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime2(n));
        sc.close();
    }
}
