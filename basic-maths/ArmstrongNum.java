import java.util.Scanner;

public class ArmstrongNum {
    public static boolean isArmstrong(int n) {
        // O(log n) time, O(1) space
        int pow = (int) (Math.floor(Math.log10(n)) + 1);
        int sumOfDigits = 0;
        int num = n;

        while (num > 0) {
            int lastDigit = num % 10;
            sumOfDigits += Math.pow(lastDigit, pow);
            num = num / 10;
        }

        return n == sumOfDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
        sc.close();
    }
}
