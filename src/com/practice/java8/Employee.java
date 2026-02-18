package com.practice.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String department;
    private double salary;
    private String gender;

    public Employee(String name, String department, double salary,String gender) {
        super();
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.gender =gender;
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


    public static void main(String[] args) {
        // TODO Auto-generated method stub



        List<Employee> employees = Arrays.asList(new Employee("Alice", "HR", 13, "female"),
                new Employee("Bob", "IT", 11, "male"),
                new Employee("Charlie", "HR", 16, "male"),
                new Employee("Daaaavid", "IT", 31, "male"),
                new Employee("Eve", "Finance", 20, "female"),
                new Employee("EAAe", "Finance", 100, "female"),
                new Employee("Ben", "Finance", 50, "male"),
                new Employee("Ben", "Finance", 70, "male"));


     Map<String, List<Employee>> empList = employees.stream().collect(Collectors.groupingBy(e->e.department));

     System.out.println("***********Grouping employee by department. ************************");
     empList.forEach((dept, emp)->{
         System.out.println(dept+":");
         emp.forEach(e-> System.out.print(e.getName()+" "));
         System.out.println();
     });

        System.out.println("***********count the number of employee in each department. ************************");

      Map<String, Long> empList2 =  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

      empList2.forEach((dept,count)->{
          System.out.println(dept+": "+count);
      });

        System.out.println("***********Find the total salary paid for each department ************************");

      Map<String, Double> empList3 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors. summingDouble(Employee::getSalary)));

      empList3.forEach((dept,salary)->{
          System.out.println(dept+" "+salary);
      });

      System.out.println("***********Group Employee by department and count gender in each department ************************");

     Map<String, Map<String, Long>> empList4 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender, Collectors.counting())));
     empList4.forEach((dept, map)->{
         System.out.println(dept+":");
         map.forEach((gen, count)->{
             System.out.println(gen+":"+count);
         });
     });

        System.out.println("***********Employeee name contain 'a' and salary even ************************");

        employees.stream().filter(e-> e.getSalary()%2==0)
                .filter(e->e.getName().toLowerCase().contains("a"))
                .forEach(e->System.out.println(e.getName()+": "+e.salary));

        System.out.println("***********Employeee name contain single 'a' and salary even ************************");
        employees.stream().filter(e-> e.getSalary()%2 == 0)
                .filter(e-> e.getName().toLowerCase().chars().mapToObj(c-> (char)c)
                        .filter(c-> c=='a').count()==1)
                .forEach(e-> System.out.println(e.getName()+": "+e.getSalary()));

        System.out.println("*******Group employees by department and collect their names as a comma-separated string************************");

     Map<String, String> empList5 =   employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.mapping(Employee::getName, Collectors.joining(","))));

     empList5.forEach((dept,name)->{
         System.out.println(dept+": "+name);
     });
    }
}
