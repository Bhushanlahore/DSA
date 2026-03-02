package com.practice.javacode;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static Character findNonRepeatingCharacter(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char ch: str.toCharArray()){

                map.put(ch, map.getOrDefault(ch, 0)+1);

}
        for(Map.Entry<Character, Integer> entry: map.entrySet()){

            if(entry.getValue() == 1){
                return entry.getKey();

            }
        }

        return null;
    }
    public static void main(String args[]){

        System.out.println(findNonRepeatingCharacter("aabbcde"));
    }
}
