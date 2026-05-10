package com.shailendra.collectionfreamwork.Collection.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public void showLinkedListDemo() {
        System.out.println("=========================LinkedListDemo=======================");
        LinkedList<String> list = new LinkedList<>();

        //TODO : Add in list
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("pineapple");
        list.add("Watermelon");
        list.add("strawberry");
        list.add("muskmelon");

        //TODO: Print
        for(String item: list) {
            System.out.println(item);
        }

        //TODO: update
        list.add(2, "grape");
        list.addFirst("kiwi");
        list.addLast("tomato");


        //TODO: remove
        list.remove("banana");
        list.remove(2);
        list.removeFirst();
        list.removeLast();

        //TODO: Contains
        boolean re = list.contains("pineapple");
        System.out.println(re);

        //TODO: size
        System.out.println("Linked list size " + list.size());

        //TODO: Print using iterator
        Iterator<String> it  = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //TODO: Shorting
        Collections.sort(list);

        //


        //TODO: is Empty
        System.out.println("Linked List is Empty " + list.isEmpty());

        //TODO: clear
        list.clear();
        System.out.println("Linked List is Empty " + list.isEmpty());

       /* TODO:
            LinkedList Properties
                Property	            Description
                Data Structure	      Doubly Linked List
                Order	              Maintains insertion order
                Duplicate	          Allows duplicates
                Null                  Values	Allows null
                Thread Safe	          No
                Random Access	      Slow
                Insert/Delete	      Fast in middle
                Implements	          List, Deque


         */








    }

}
