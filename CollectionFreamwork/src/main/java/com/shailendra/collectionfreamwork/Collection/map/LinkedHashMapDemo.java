package com.shailendra.collectionfreamwork.Collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public void demonstrateLinkedHashMap() {

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("one", "one");
        linkedHashMap.put("two", "two");
        linkedHashMap.put("three", "three");
        linkedHashMap.put("four", "four");
        linkedHashMap.put("five", "five");


        //hull
        linkedHashMap.put("six", null);

        //print
        System.out.println(linkedHashMap);

        //Access
        System.out.println(linkedHashMap.get("one"));

        System.out.println(linkedHashMap.get("two"));
        System.out.println(linkedHashMap.get("three"));

        //remove
        linkedHashMap.remove("three");

        //replace
        linkedHashMap.replace("two", "two", "TWO");


//        | Property         | Description                  |
//        | ---------------- | ---------------------------- |
//        | Data Structure   | Hash Table + Linked List     |
//        | Order            | Maintains insertion order    |
//        | Duplicate Keys   | Not allowed                  |
//        | Duplicate Values | Allowed                      |
//        | Null Key         | One null key allowed         |
//        | Null Values      | Allowed                      |
//        | Thread Safe      | No                           |
//        | Performance      | Slightly slower than HashMap |



    }

}
