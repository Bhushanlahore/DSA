package com.corejavaconcepts;

import java.util.*;

public class StudentComparable implements  Comparable<StudentComparable>{

    int id;
    String name;

    StudentComparable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(StudentComparable o) {
        return this.name.compareTo(o.name);
    }

//    @Override
//    public int compareTo(StudentComparable o) {
//        return this.id - o.id;
//    }

    public static void main(String args[]){

        List<StudentComparable> s1 = new ArrayList<>();

        s1.add(new StudentComparable(2,"Bhushan"));
        s1.add(new StudentComparable(1,"Rahul"));
        s1.add(new StudentComparable(3,"Nihal"));

        Collections.sort(s1);

        for(StudentComparable s: s1){
            System.out.println(s.id+": "+s.name);
        }

    }
}
