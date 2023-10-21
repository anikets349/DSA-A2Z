import java.util.Scanner;
import java.util.Arrays;

public class HashingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // max size of the hash is 13
        int[] hash = new int[13];
        Arrays.fill(hash, 0);
        // precompute - freq of each element
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            // fetch - freq from the hash
            System.out.println(num + " -> " + hash[num]);
        }
        sc.close();
    }
}
