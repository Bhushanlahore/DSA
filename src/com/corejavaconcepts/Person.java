package com.corejavaconcepts;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Person{

    private String name;
    private String department;
    private double salary;
    private String gender;

    public Person(String name, String department, double salary, String gender) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static  void main(String args[]){

        List<Person> personList = Arrays.asList(new Person("Bhushan", "IT", 56000, "male"),
                new Person("Disha", "IT", 1010000, "female"),
                new Person("Sahil", "Finance", 95000, "male"),
                new Person("Nikki", "HR", 20000, "female"),
                new Person("Vipin", "IT", 30000, "male"),
                new Person("Bhushan", "Finance", 84000, "male"),
                new Person("Naina", "HR", 86000, "female"),
                new Person("Neha", "Finance", 59000, "female"));

        System.out.println("===========================Group by Department=========================");

        Map<String, List<Person>> list1 = personList.stream().collect(Collectors.groupingBy(Person::getDepartment));

        list1.forEach((dept, emp)->{
            System.out.println(dept+":");
            emp.forEach(e-> System.out.println(e.getName()));
        });

        System.out.println("===========================Count employee by Department=========================");

        Map<String, Long> list2 = personList.stream().collect(Collectors.groupingBy(Person::getDepartment, Collectors.counting()));

        list2.forEach((dept,count)->{
            System.out.println(dept+"=>"+count);
        });

        System.out.println("===========================find total salary paid per Department=========================");

       Map<String, Double> list3 = personList.stream().collect(Collectors.groupingBy(Person::getDepartment, Collectors.summingDouble(Person::getSalary)));

       list3.forEach((dept,sum)-> System.out.println(dept+"=>"+sum));

        System.out.println("===========================Count gender in each dept Department=========================");

      Map<String, Map<String, Long>> list4 =  personList.stream().collect(Collectors.groupingBy(Person::getDepartment, Collectors.groupingBy(Person::getGender, Collectors.counting())));

      list4.forEach((dept, map)->{
          System.out.println(dept+":");
          map.forEach((gender, count)->{
              System.out.println(gender+"=>"+count);
          });
      });

    }
}
