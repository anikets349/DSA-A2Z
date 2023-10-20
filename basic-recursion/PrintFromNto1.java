import java.util.Scanner;

public class PrintFromNto1 {
    // O(n) time, O(n) space
    public static void printNto1(int i, int n) {
        if (i > n)
            return;
        printNto1(i + 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNto1(1, n);
        sc.close();
    }
}
