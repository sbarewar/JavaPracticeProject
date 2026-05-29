package com.shailendra.collectionfreamwork.practiceProgram.hashmapPractice;

import java.util.HashMap;

public class CharacterFrequency {

    public void CharacterFrequencyDemo() {

        String str ="programming";

        HashMap<Character, Integer> map  = new HashMap<Character, Integer>();
        for (char ch : str.toCharArray()) {
            if(map.containsKey(ch)) {

                map.put(ch, map.get(ch) + 1);
            }else {
                map.put(ch,1);
            }
        }

        System.out.println("After map: " + map);

    }
}
