package com.leetcodeOrDP;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int target =0;
        int len = s.length();

        for(int i=0; i<s.length(); i++){

            if(i<len-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                target = target - map.get(s.charAt(i));
            }else{
                target = target + map.get(s.charAt(i));
            }

        }
        return target;
    }

    public static void main(String args[]){

        String str = "LVIII";

        System.out.println(romanToInt(str));
    }
}
