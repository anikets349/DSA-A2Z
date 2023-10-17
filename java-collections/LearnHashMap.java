import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

/*
 * Map is used to store key value pairs
 * HashMap --> unordered
 * LinkedHashMap, TreeMap --> ordered
 * Methods:
 * put --> add a key value pair in the map
 * putIfAbsent
 * remove
 * containsKey
 * entrySet
 * keySet
 * values
 * containsKey
 * containsValue
 * isEmpty
*/

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        System.out.println(map);

        map.put("India", "IN");
        map.put("Australia", "AU");
        map.put("England", "EN");
        map.put("New Zealand", "NZ");
        map.put("South Africa", "SA");
        System.out.println(map);

        if (!map.containsKey("Pakistan"))
            map.put("Pakistan", "PK");

        map.putIfAbsent("West Indies", "WI");

        System.out.println(map);
        System.out.println(map.size());

        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println("Entry: " + e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
