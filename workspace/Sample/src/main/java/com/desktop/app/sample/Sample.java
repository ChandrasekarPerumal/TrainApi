package com.desktop.app.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Sample {

    public static void countWords(String str) {
        Map<String, Integer> wordCount_map = new HashMap<>();
        for (String a : str.split(" ")) {
            if (wordCount_map.containsKey(a)) {
                wordCount_map.put(a, wordCount_map.get(a) + 1);
            } else {
                wordCount_map.put(a, 1);
            }
        }
        wordCount_map.forEach((key, value) -> System.out.println(key + ":" + value));
    }

    public static void countChar(String str) {
        Map<Character, Integer> wordCount_map = new HashMap<>();

        for (Character ch : str.toCharArray()) {
            if (ch != ' ') {
                if (wordCount_map.containsKey(ch)) {
                    wordCount_map.put(ch, wordCount_map.get(ch) + 1);
                } else {
                    // First time
                    wordCount_map.put(ch, 1);
                }
            }
        }

        wordCount_map.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }

    public static void main(String[] args) {

        String str = "this is java this is";

        try {

            Optional<Integer> num = Optional.of(1);
            Optional<String> strng = Optional.of("   Strings Strings Strings Strings   ");
            System.out.println("Number:" + strng.map(String::length).get());
            String []sp = strng.get().replace("S", "c").split(" ");
            
            for(String i: sp){
                System.out.println(i);
            }
            
            
//            System.out.println(" Count String ");
//            countWords(str);

//            System.out.println(" Count Characters ");

//            countChar(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
