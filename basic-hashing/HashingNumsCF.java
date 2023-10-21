import java.util.Scanner;
import java.util.HashMap;

public class HashingNumsCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // precompute
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int key = sc.nextInt();
            // fetch
            System.out.println(key + " -> " + map.get(key));
        }

        sc.close();
    }
}