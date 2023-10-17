import java.util.Scanner;

public class Pattern19 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 0; j < n - i; j++)
                System.out.print("* ");
            // spaces
            for (int j = 0; j < 2 * i; j++)
                System.out.print("  ");
            // stars
            for (int j = 0; j < n - i; j++)
                System.out.print("* ");
            System.out.println();
        }
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
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
