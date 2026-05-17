package com.shailendra.collectionfreamwork.Collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public void demonstrateLinkedHashSet() {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Jabalpur");
        linkedHashSet.add("Raipur");
        linkedHashSet.add("Pune");
        linkedHashSet.add("Mumbai");
        linkedHashSet.add("Delhi");
        linkedHashSet.add("Jaipur");
        linkedHashSet.add("Agara");
        linkedHashSet.add("Jabalpur");
        //Add null
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        //Print
        for(String s : linkedHashSet) {
            System.out.println(s);
        }

        //size
        System.out.println("Size " + linkedHashSet.size());

        //contains
        System.out.println("contains " + linkedHashSet.contains("Pune"));

        //remove
        linkedHashSet.remove("Pune");

        //is empty
        System.out.println("is Empty " + linkedHashSet.isEmpty());

        //Iterator
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        linkedHashSet.clear();
        System.out.println("Size " + linkedHashSet.size());

        // =========================
        // Important Properties
        // =========================
        System.out.println("\n===== LinkedHashSet Properties =====");

        System.out.println("1. Does NOT allow duplicate values");
        System.out.println("2. Maintains insertion order");
        System.out.println("3. Allows one null value");
        System.out.println("4. Internally uses LinkedHashMap");
        System.out.println("5. Slightly slower than HashSet");

    }
}
