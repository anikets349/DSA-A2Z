import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class HighestLowestFreq {
    public static int[] getFrequencies(int[] v) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < v.length; i++) {
            int key = v[i];
            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        int highestFrequency = Integer.MIN_VALUE;
        int lowestFrequency = Integer.MAX_VALUE;
        int highestFrequencyElement = Integer.MAX_VALUE;
        int lowestFrequencyElement = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > highestFrequency || (frequency == highestFrequency && element < highestFrequencyElement)) {
                highestFrequency = frequency;
                highestFrequencyElement = element;
            }

            if (frequency < lowestFrequency || (frequency == lowestFrequency && element < lowestFrequencyElement)) {
                lowestFrequency = frequency;
                lowestFrequencyElement = element;
            }
        }

        return new int[] { highestFrequencyElement, lowestFrequencyElement };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        int[] ans = getFrequencies(v);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
}
