package com.practice.javacode;

import java.util.HashMap;

public class findDuplicateCharacter {

    public static void findDuplicate(String str){

        HashMap<Character, Integer> map= new HashMap<>();

        for(char ch: str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        map.forEach((ch, no) -> {
            if(no>1)
            System.out.println(ch+": "+no);
        });
    }

    public static void main(String args[]){

        findDuplicate("programming");
    }
}
