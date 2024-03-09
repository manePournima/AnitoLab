package class_project;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap with integer keys and string values
        Map<Integer, String> myMap = new HashMap<>();

        // Adding key-value pairs
        myMap.put(1, "One");
        myMap.put(2, "Two");
        myMap.put(3, "Three");

        // Accessing values using keys
        System.out.println("Value for key 2: " + myMap.get(2));

        // Iterating over keys and values
        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Checking if a key exists
        if (myMap.containsKey(1)) {
            System.out.println("Key 1 exists in the map");
        }

        // Checking if a value exists
        if (myMap.containsValue("Three")) {
            System.out.println("Value 'Three' exists in the map");
        }

        // Removing a key-value pair
        myMap.remove(2);

        // Size of the map
        System.out.println("Size of the HashMap: " + myMap.size());
    }
}
