package com.shailendra.collectionfreamwork.practiceProgram.hashmapPractice;

import java.util.HashMap;
import java.util.Map;

public class FrequencySort {

    public void frequencySort() {
        int[] arr = {1,2,3,2,1,1,4,2};

        HashMap<Integer, Integer > map  = new HashMap<Integer, Integer>();
        for(int i: arr) {
            map.put(i , map.getOrDefault(i, 0) + 1);

        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => "+  entry.getValue());
        }
    }
}
