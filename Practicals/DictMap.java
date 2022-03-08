// Class Notes on Dictionaries and Maps

// In python: {'apple': 'fruit'}

// "get", "put"

import java.util.*;

public class DictMap {

  {

    // Must desclare the key and value types
    Map<String, Integer> items = new HashMap<>();

    // Most commonly, one will loop over keys.

    for (String key : items.keySet()) {
      System.out.println("keySet: " + key + " -> " + items.get(key));
    }

    for (Integer val : items.values()) {
      System.out.println("values -> " + val);
    }

    Map<String, Integer> counts = new HashMap<>();
    String[] data = { "a", "b", "a", "a", "b", "c", "d" };
    for (String item : data) {
      counts.put(item, counts.get(item) + 1);
    }

    System.out.println(counts);

  }
}
