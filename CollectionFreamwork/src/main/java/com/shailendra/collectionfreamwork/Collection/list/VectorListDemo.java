package com.shailendra.collectionfreamwork.Collection.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorListDemo {


    public void demonstrateVectorList() {
        System.out.println("=========================VectorListDemo=======================");

        Vector<String> vector = new Vector<>();

        // 1 Add
        vector.add("India");
        vector.add("US");
        vector.add("China");
        vector.add("Japan");
        vector.add("Germany");
        vector.add("Russia");

        //2 print
        for(String item : vector) {
            System.out.println(item);
        }

        //3 add specific place
        vector.add(2, "UK");
        System.out.println("After adding UK at index 2: " + vector);

        //4 get element
        System.out.println("get element " + vector.get(3));

        //5 update element
        vector.set(1, "Australia");
        System.out.println("After updating index 1 to Australia: " + vector);

        //6 remove element
        vector.remove(4);
        System.out.println("After removing element at index 4: " + vector);

        vector.remove("Russia");
        System.out.println("After removing Russia: " + vector);

        //7 check contains
        boolean re = vector.contains("india");
        System.out.println("Vector contains India: " + re);

        //8 size
        System.out.println("Size of Vector: " + vector.size());

        //9 Firest element
        System.out.println("get firest Element " + vector.firstElement());

        //10 last Element
        System.out.println("get the last Element "+ vector.lastElement());

        //11 Iterator
        Iterator<String> it = vector.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }


        //12 clear
        vector.clear();
        System.out.println("is Empty " + vector.isEmpty());



    }
}
