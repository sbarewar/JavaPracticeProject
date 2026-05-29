package com.shailendra.collectionfreamwork.Collection.map;

import java.util.Hashtable;

public class HashTableDemo {

    public void demonstrateHashTable() {

        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        //add
        hashtable.put(1, "one");
        hashtable.put(2, "two");
        hashtable.put(3, "three");
        hashtable.put(4, "four");
        hashtable.put(5, "five");


        //print
        for(String value : hashtable.values()) {
            System.out.println(value);

        }

        //size
        System.out.println("size " + hashtable.size());
        //contains
        System.out.println("Contains "+ hashtable.contains("three"));

        //remove
        hashtable.remove(3);


        //replace
        hashtable.replace(2, "two", "TWO");

        //is Empty
        System.out.println("is Empty "+ hashtable.isEmpty());

//        | Property         | Description         |
        //| ---------------- | ------------------- |
        //| Stores data as   | Key-Value pair      |
        //| Order            | No insertion order  |
        //| Duplicate Keys   | Not allowed         |
        //| Duplicate Values | Allowed             |
        //| Null Key         | Not allowed         |
        //| Null Value       | Not allowed         |
        //| Thread Safe      | Yes                 |
        //| Performance      | Slower than HashMap |




    }
}
