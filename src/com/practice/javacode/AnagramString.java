package com.practice.javacode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AnagramString {

    public static boolean checkAnangramString1(String s1, String s2){

        if(s1.length() != s2.length())
            return false;

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    public static boolean checkAnangramString2(String s1, String s2){
        Map<Character, Integer> map = new HashMap<>();

        for(char ch: s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char ch: s2.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)-1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() != 0){
                return false;
            }
        }
        return  true;
    }
    public static void findFirstNonRepeatingChar(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> c: map.entrySet()){

            if(c.getValue() == 1){
                System.out.println(c.getKey()+": "+c.getValue());
                return;
            }
        }
        return;
    }
    public static void main(String args[]){

        System.out.println(checkAnangramString1("bhushaan", "hbshanu"));
        System.out.println(checkAnangramString2("bhushana", "hbshanu"));
        findFirstNonRepeatingChar("aabbxccdee");
    }
}
