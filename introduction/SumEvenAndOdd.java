import java.util.Scanner;

public class SumEvenAndOdd {
    public static void ans(int n) {
        int sumEven = 0, sumOdd = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0)
                sumEven += digit;
            else
                sumOdd += digit;

            n = n / 10;
        }

        System.out.println(sumEven + " " + sumOdd);
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ans(n);

        sc.close();
    }
}
