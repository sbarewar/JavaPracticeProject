package com.shailendra.collectionfreamwork;

import com.shailendra.collectionfreamwork.Collection.list.ArrayListDemo;
import com.shailendra.collectionfreamwork.Collection.list.LinkedListDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionFreamworkApplication {

    public static void main(String[] args) {

        SpringApplication.run(CollectionFreamworkApplication.class, args);

        ArrayListDemo arrayListDemo = new ArrayListDemo();
       arrayListDemo.demonstrateArrayList();

       LinkedListDemo linkedListDemo = new LinkedListDemo();
       linkedListDemo.showLinkedListDemo();




    }

}
