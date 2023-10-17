import java.util.Scanner;

public class Pattern11 {
    public static void printPattern(int n) {
        int digit = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                digit = 1;
            else
                digit = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(digit + " ");
                digit = 1 - digit;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
