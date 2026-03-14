package dsa1.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// HashMap in java stores the data in (key, value) pairs.
public class HashMapLearn {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();

    // Insertion
    map.put("India", 120);
    map.put("China", 150);
    map.put("USA", 50);
    map.put("Russia", 35);

    System.out.println(map);
    map.put("China", 1900);
    System.out.println(map);

    // Searching
    if (map.containsKey("Indonasia")) {
      System.out.println("Key is present in the map");
    } else {
      System.out.println("Key is not present in the map");
    }

    // Get the value of Key
    System.out.println(map.get("China"));
    System.out.println(map.get("Indonasia"));

    // Iteration 1
    for (Map.Entry<String, Integer> e : map.entrySet()) {
      System.out.print(e.getKey() + " ");
      System.out.println(e.getValue());
    }

    // Iteration 2
    Set<String> keys = map.keySet();
    for (String key : keys) {
      System.out.println(key + " : " + map.get(key));
    }

    // Removing
    map.remove("China");
    System.out.println(map);
  }
}
