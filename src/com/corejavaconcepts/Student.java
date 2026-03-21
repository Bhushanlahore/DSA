package com.corejavaconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static  void main(String args[]){

        List<Student> s1 = new ArrayList<>();

        s1.add(new Student(2,"Bhushan"));
        s1.add(new Student(1,"Rahul"));
        s1.add(new Student(3,"Nihal"));

       // Comparator<Student> byId = (a,b) -> a.id - b.id;

       // Comparator<Student> byName = (a,b) -> a.name.compareTo(b.name);

       // Collections.sort(s1, new StudnetIdComparator());

        Collections.sort(s1, new StudentNameComparator());

        for(Student s: s1){
            System.out.println(s.id+": "+s.name);
        }

    }
}
