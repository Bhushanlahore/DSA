package com.corejavaconcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String args[]){

        Map<Person, String> map = new HashMap<>();

        Person p1 = new Person("Bhushan", "IT", 56000, "male");
        Person p2 = new Person("Bhushan", "IT", 56000, "male");

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        map.put(p1, "A");
        map.put(p2, "B");

        System.out.println(map.get(p2));
        System.out.println(map.get(p1));

        System.out.println(map.size());
    }
}
