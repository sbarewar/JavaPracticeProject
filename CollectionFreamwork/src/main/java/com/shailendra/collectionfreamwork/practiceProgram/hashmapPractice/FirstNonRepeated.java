package com.shailendra.collectionfreamwork.practiceProgram.hashmapPractice;

import java.util.HashMap;

public class FirstNonRepeated {

    public void firstNonRepeated() {

        String str = "aabbcddee";

        HashMap<Character, Integer> map  = new HashMap<Character, Integer>();
        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Character ch : map.keySet()) {

            if(map.get(ch) == 1) {
                System.out.println(" Non Repat value " + map.get(ch));
                break;
            }
        }
    }
}
