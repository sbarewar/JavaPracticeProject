package com.shailendra.collectionfreamwork.practiceProgram.hashmapPractice;

import java.util.HashMap;

public class TwoSum {

    public void twoSum() {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            int com = target - arr[i];
            if(map.containsKey(com)){
                System.out.println("index " + map.get(com) + ", " + i);
                return;
            }
            map.put(arr[i], i);

        }



    }
}
