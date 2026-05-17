package com.shailendra.collectionfreamwork.Collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public void demonstrateTreeSet() {

        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Microwave");
        treeSet.add("Dishwasher");
        treeSet.add("Refrigerator");
        treeSet.add("Washing Machine");
        treeSet.add("Mixer");
        treeSet.add("coffee Machine");
        treeSet.add("Mixer");




        for(String s : treeSet) {
            System.out.println(s);
        }

        //Size
        System.out.println("Size "+ treeSet.size());

        //contains
        System.out.println("Contains "+ treeSet.contains("Refrigerator"));

        //remove
        treeSet.remove("Mixer");

        //firest

       System.out.println("1st value "+  treeSet.first());

       //last
        System.out.println("last value " +  treeSet.last() );

        //higher
        System.out.println("Higher " + treeSet.higher("Refrigerator"));

        //lower
        System.out.println("Lower " + treeSet.lower("Refrigerator"));

        //ceiling
        System.out.println("Ceiling "+ treeSet.ceiling("Refrigerator"));

        //floor
        System.out.println("Floor " + treeSet.floor("Refrigerator"));

        //Iterator
        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //descending
        System.out.println("descending " + treeSet.descendingSet());

        //Poll first
        System.out.println("Poll first "+ treeSet.pollFirst());

        //Poll last
        System.out.println("Poll last " + treeSet.pollLast());

        //remove
        treeSet.remove("Microwave");

        treeSet.clone();

        //clear
        treeSet.clear();


        // =========================
        // Important Properties
        // =========================
        System.out.println("\n===== TreeSet Properties =====");

        System.out.println("1. Does NOT allow duplicate values");
        System.out.println("2. Maintains sorted order");
        System.out.println("3. Default sorting is ascending");
        System.out.println("4. Null values are NOT allowed");
        System.out.println("5. Internally uses Red-Black Tree");
        System.out.println("6. Slower than HashSet");

    }
}
