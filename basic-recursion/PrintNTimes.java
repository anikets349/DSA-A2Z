import java.util.Scanner;

public class PrintNTimes {
    // O(n) time, O(n) space
    public static void print(int i, int n) {
        if (i > n)
            return;
        System.out.println("Hello Recursion");
        print(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1, n);
        sc.close();
    }
}
