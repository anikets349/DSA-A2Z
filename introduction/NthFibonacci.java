import java.util.Scanner;

public class NthFibonacci {

    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;

        int a = 0, b = 1, ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = a + b;
            a = b;
            b = ans;
        }

        return ans;
    }

    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = fib(n);
        System.out.println(ans);

        sc.close();
    }

}
