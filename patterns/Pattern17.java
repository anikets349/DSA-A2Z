import java.util.Scanner;

public class Pattern17 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            // spaces
            for (int j = 0; j < n - i - 1; j++)
                System.out.print("  ");
            // alphabet
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch + " ");
                if (j >= (2 * i + 1) / 2)
                    ch--;
                else
                    ch++;
            }
            // spaces
            for (int j = 0; j < n - i - 1; j++)
                System.out.print("  ");
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
