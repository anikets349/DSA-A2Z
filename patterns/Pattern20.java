import java.util.Scanner;

public class Pattern20 {
    public static void printPattern(int n) {
        int numSpaces = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            // spaces
            for (int j = 0; j < numSpaces; j++)
                System.out.print("  ");
            // stars
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            numSpaces -= 2;
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            // stars
            for (int j = 0; j < n - i - 1; j++)
                System.out.print("* ");
            // spaces
            for (int j = 0; j < 2 * i + 2; j++)
                System.out.print("  ");
            // stars
            for (int j = 0; j < n - i - 1; j++)
                System.out.print("* ");
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
