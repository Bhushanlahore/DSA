package com.practice.javacode;

import java.util.HashMap;

public class FIndFrequencyOfCharacter {

    public static void countFrequency(String str){

        HashMap<Character, Integer> map= new HashMap<>();

        for(char ch: str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch,0) + 1);

        }

        map.forEach((ch, no) -> {

                System.out.println(ch+": "+no);

        });
    }

    public static void main(String args[]){
        countFrequency("aabbcde");

    }
}
