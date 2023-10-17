import java.util.Scanner;

public class Pattern12 {
    public static void printPattern(int n) {
        int numSpaces = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            // num
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            // space
            for (int j = 0; j < numSpaces; j++)
                System.out.print("  ");
            // num
            for (int j = i; j > 0; j--)
                System.out.print(j + " ");
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
