import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class PrintAllDivisors {
    // brute force - O(n) time
    public static ArrayList<Integer> printDivisors1(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                divisors.add(i);
        }
        return divisors;
    }

    // optimal - O(sqrt n) time
    public static ArrayList<Integer> printDivisors2(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != (n / i))
                    divisors.add(n / i);
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printDivisors2(n));
        sc.close();
    }
}
