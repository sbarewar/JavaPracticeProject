package com.shailendra.collectionfreamwork.Collection.list;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@Component
public class ArrayListDemo {

    List<String> arr = new ArrayList<>();

    //TODO: 1 add Items
    public void addItems(String item) {
        arr.add(item);
    }


    //TODO: 2 print Items
    public void printItems() {
        for (String item : arr) {
            System.out.println(item);
        }
    }

    //TODO: 3 update Item
    public void updateItems(int index, String item) {
        arr.set(index, item);
        System.out.println(arr.get(index));
    }

    //TODO: 4 Remove item
    public void removeItems(int index, String item) {
        arr.remove(index);
        System.out.println("Item " + item + " removed from ArrayList");
        System.out.println("Updated ArrayList: " + arr);
    }

    //TODO: 5 CheckContains
    public boolean checkContains(String item) {
        return arr.contains(item);
    }

    //TODO: 6 Check Size
    public void checkSize() {
        System.out.println("Size of ArrayList: " + arr.size());
    }


    //TODO: 7 Print using iterator
    public void printUsingIterator() {
        Iterator<String> list = arr.iterator();
        while(list.hasNext()) {
            System.out.println(list.next());
        }

    }
    //TODO: 8 sorting
    public void sorting() {
        Collections.sort(arr);
        System.out.println("Sorted ArrayList: " + arr);

    }

    //TODO: 9 check Empty
    public void isEmpty() {
        System.out.println("Array is Empty " + arr.isEmpty());
    }


    //TODO: 10 Clear Array List
    public void clearList() {
        arr.clear();
        System.out.println("Array is Empty " + arr.isEmpty());
    }


    public void demonstrateArrayList() {
        System.out.println("Demonstrate ArrayList");

        //ADD items
        addItems("Shailendra");
        addItems("Rohit");
        addItems("Tripti");
        addItems("Navaksh");


        //Print items
        printItems();
        //Update item
        updateItems(1, "Rohit Kumar");
        //Remove item
        removeItems(2, "Tripti");
        //check array contains item
        System.out.println("Contains 'Shailendra': " + checkContains("Shailendra"));
        //Check size
        checkSize();
        // print by iterator
        printUsingIterator();

        //Sorting
        sorting();
        //Check Empty
        isEmpty();
        //Empty ArrayList
        clearList();
    }


    //TODO: Array Property
    /*    Property	             Description
        Data Structure	        Dynamic Array
        Package	                java.util
        Order	                Maintains insertion order
        Duplicate	            Allows duplicates
        Null                    Values	Allows multiple nulls
        Thread Safe	            No
        Performance	            Fast retrieval
        Resizable	            Yes
        Random Access	        Very fast using index
        Synchronization	        Not synchronized
     */


}
