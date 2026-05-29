package com.shailendra.collectionfreamwork.practiceProgram.hashmapPractice;

import java.util.HashMap;

public class WordFrequency {

    public void wordFrequency() {
        String str = "java is easy java is powerful";

        String[] words = str.split(" ");

        HashMap<String , Integer>  map = new HashMap<>();

        for(String word: words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency: " + map);
    }
}
