package com.shailendra.collectionfreamwork;

import com.shailendra.collectionfreamwork.Collection.list.ArrayListDemo;
import com.shailendra.collectionfreamwork.Collection.list.LinkedListDemo;
import com.shailendra.collectionfreamwork.Collection.list.StackDemo;
import com.shailendra.collectionfreamwork.Collection.list.VectorListDemo;
import com.shailendra.collectionfreamwork.Collection.map.HashTableDemo;
import com.shailendra.collectionfreamwork.Collection.map.LinkedHashMapDemo;
import com.shailendra.collectionfreamwork.Collection.queue.QueueDemo;
import com.shailendra.collectionfreamwork.Collection.set.HashSetDemo;
import com.shailendra.collectionfreamwork.Collection.set.LinkedHashSetDemo;
import com.shailendra.collectionfreamwork.Collection.set.TreeSetDemo;
import com.shailendra.collectionfreamwork.practiceProgram.hashmapPractice.FrequencySort;
import com.shailendra.collectionfreamwork.practiceProgram.hashmapPractice.TwoSum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionFreamworkApplication {

    public static void main(String[] args) {

        SpringApplication.run(CollectionFreamworkApplication.class, args);

        ArrayListDemo arrayListDemo = new ArrayListDemo();
       arrayListDemo.demonstrateArrayList();
        System.out.println("=====================================================");
       LinkedListDemo linkedListDemo = new LinkedListDemo();
       linkedListDemo.showLinkedListDemo();
        System.out.println("=====================================================");

        VectorListDemo vectorListDemo = new VectorListDemo();
        vectorListDemo.demonstrateVectorList();
        System.out.println("=====================================================");
        StackDemo stackDemo = new StackDemo();
        stackDemo.demonstrateStack();
        System.out.println("=====================================================");
        HashSetDemo hashSetDemo = new HashSetDemo();
        hashSetDemo.demonstrateHashSet();
        System.out.println("=====================================================");
        LinkedHashSetDemo linkedHashSetDemo = new LinkedHashSetDemo();
        linkedHashSetDemo.demonstrateLinkedHashSet();
        System.out.println("=====================================================");
        TreeSetDemo treeSetDemo = new TreeSetDemo();
        treeSetDemo.demonstrateTreeSet();
        System.out.println("=====================================================");

        QueueDemo queueDemo = new QueueDemo();
        queueDemo.demonstrateQueue();
        System.out.println("=====================================================");

        HashTableDemo hashTableDemo = new HashTableDemo();
        hashTableDemo.demonstrateHashTable();
        System.out.println("=====================================================");

        LinkedHashMapDemo linkedHashMapDemo = new LinkedHashMapDemo();
        linkedHashMapDemo.demonstrateLinkedHashMap();


        System.out.println("Interview practice code ");

        FrequencySort frequencySort = new FrequencySort();
        frequencySort.frequencySort();
        System.out.println("=====================================================");

        TwoSum twoSum = new TwoSum();
        twoSum.twoSum();

    }

}
