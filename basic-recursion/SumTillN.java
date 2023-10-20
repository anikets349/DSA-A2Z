import java.util.Scanner;

public class SumTillN {
    public static int sumTillNParameterized(int n, int sum) {
        if (n <= 0)
            return sum;
        return sumTillNParameterized(n - 1, sum + n);
    }

    public static int sumTillNFunctional(int n) {
        if (n == 0)
            return 0;
        return n + sumTillNFunctional(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sumTillNFunctional(n);
        System.out.println(ans);
        sc.close();
    }
}
