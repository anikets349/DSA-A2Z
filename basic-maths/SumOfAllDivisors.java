import java.util.Scanner;

public class SumOfAllDivisors {
    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != (n / i))
                    sum += n / i;
            }
        }
        return sum;
    }

    // O(n sqrt(n)) time, O(1) space
    public static int sumOfAllDivisors(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += sumOfDivisors(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfAllDivisors(n));
        sc.close();
    }
}
