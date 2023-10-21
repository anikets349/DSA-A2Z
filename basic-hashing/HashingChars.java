import java.util.Scanner;

public class HashingChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // hash
        int[] hash = new int[27];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a'] += 1;
        }

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            char ch = sc.next().charAt(0);
            // fetch
            System.out.println(ch + " -> " + hash[ch - 'a']);
        }
        sc.close();
    }
}
