package com.shailendra.collectionfreamwork.Collection.map;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {

    public void demonstrateHashMap() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // Add values
        map.put(101, "Java");
        map.put(102, "Spring Boot");
        map.put(103, "React");

        // Print map
        System.out.println(map);

        // Get value
        System.out.println("Value of key 102: " + map.get(102));

        // Remove value
        map.remove(103);

        System.out.println("After remove: " + map);



        // Properties
//        | Property         | Description                  |
//        | ---------------- | ---------------------------- |
//        | Stores data as   | Key-Value pair               |
//        | Order            | No insertion order           |
//        | Duplicate Keys   | Not allowed                  |
//        | Duplicate Values | Allowed                      |
//        | Null Key         | One null key allowed         |
//        | Null Values      | Multiple null values allowed |
//        | Thread Safe      | No                           |
//        | Performance      | Very fast                    |

    }

}
