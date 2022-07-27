package com.ssi.java8;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {

    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Integer age) {
        this.age = age;
    }

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class StreamTest {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tom", 23));
        employees.add(new Employee("Kim", 23));
        employees.add(new Employee("John", 32));
        employees.add(new Employee("Tina", 26));
        employees.add(new Employee("Mike", 40));
        employees.add(new Employee("Jenna", 40));

        //filter (predict)
        //List<Employee> list = employees.stream().filter(e -> e.age > 26).collect(Collectors.toList());
        Optional<Employee> optional = employees.stream().filter(e -> e.age > 50).findAny();
        System.out.println(optional.isEmpty()? " " : optional.get());

        //map
        List<String> list1 =  employees.stream().map(e -> e.getName()).collect(Collectors.toList());
        //System.out.println(list1);

        //groupby
        //Map<Integer,List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getAge));
        Map<Integer,Integer> map = employees.stream().collect(Collectors.groupingBy(e -> e.getAge(), Collectors.summingInt(e -> 1)));
//        System.out.println(map);

        //joining
        String names = employees.stream().map(e -> e.getName()).collect(Collectors.joining(","));
//        System.out.println(names);
    }
}
