import java.util.Scanner;
import java.util.HashMap;

public class HashingCharsCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // precompute
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.replace(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            char ch = sc.next().charAt(0);
            // fetch
            System.out.println(ch + " -> " + map.get(ch));
        }

        sc.close();
    }
}
