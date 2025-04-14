package dsa.data_structures.hash_map;

import java.util.HashMap;

public class Hashmaps {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "bugra");
        hashMap.put(2, "ahmet");
        hashMap.put(3, "mehmet");

        System.out.println("last element: " + hashMap.get(3));

        if (hashMap.containsKey("mehmet"))
            System.out.println("mehmet exists");

        hashMap.remove(2); // keyini null'lar, itemi silmez

        hashMap.size(); // now 2

        System.out.println();

        // iterate keys
        for (Integer key : hashMap.keySet()) {
            System.out.print(key + " ");
        }

        System.out.println();

        // iterate key-value
        for (var entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
