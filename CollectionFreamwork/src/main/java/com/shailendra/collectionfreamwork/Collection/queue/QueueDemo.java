package com.shailendra.collectionfreamwork.Collection.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public void demonstrateQueue() {

        Queue<String> queue = new LinkedList<>();

        //1 add
        queue.add("Mixer");
        queue.add("Java");
        queue.add("Rose");
        queue.add("coffee Machine");


        //2 print
        for(String s : queue) System.out.println(s);

        //Offer
        queue.offer("Tea Maker");

        //3 peek
        System.out.println("Peek " + queue.peek());

        //5 element
        System.out.println("Element "+  queue.element());

        //6 pull
        System.out.println("Poll " + queue.poll());

        //7 remove
        queue.remove();
        System.out.println("Peek " + queue);

        //8 contains
        System.out.println("Contains "+ queue.contains("Tea Maker"));

        //size

        System.out.println("Size  " + queue.size());

        Iterator<String> it =  queue.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //10 isEmpty
        System.out.println("isEmpty " + queue.isEmpty());

        //11 clear
        queue.clear();
        System.out.println("isEmpty " + queue.isEmpty());

/*

Queue Properties
Property	Queue
        Order	FIFO
        Duplicate Allowed	Yes
        Null Allowed	Depends on implementation
        Index Based	No



 */




    }
}
