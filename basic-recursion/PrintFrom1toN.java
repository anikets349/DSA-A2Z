import java.util.Scanner;

public class PrintFrom1toN {
    // O(n) time, O(n) space
    public static void print1toN(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        print1toN(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1toN(1, n);
        sc.close();
    }
}
