package com.shailendra.collectionfreamwork.Collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

        public void demonstrateHashSet() {
            System.out.println("=========================HashSetDemo=======================");

            Set<String> hashSet = new HashSet<>();
            //Add
            hashSet.add("STS4");
            hashSet.add("NetBeans");
            hashSet.add("Sun");
            hashSet.add("IntelliJ");
            hashSet.add("PyCharm");
            hashSet.add("Java");
            hashSet.add("JavaScript");
            //null
            hashSet.add(null);

            //Print
            for(String s : hashSet) {
                System.out.println(s);
            }

            //contains

            System.out.println("contains " + hashSet.contains("Java"));

            //size
            System.out.println("size " + hashSet.size());

            //remove
            hashSet.remove("Java");

            //is Empty
            System.out.println("size " + hashSet.isEmpty());

            //iterator
            Iterator<String> it = hashSet.iterator();
            while(it.hasNext()) {
                System.out.println(it.next());
            }





        }
}
