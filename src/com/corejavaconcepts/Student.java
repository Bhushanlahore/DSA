package com.corejavaconcepts;

import java.util.*;

public class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Overridng equals and hashcode method
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return true;
        Student s = (Student) o;
        return id == s.id && Objects.equals(name, s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
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
