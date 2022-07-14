package com.ssi.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//element class implement comparable interface
class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        if (this.age != s.age) {
            return this.age - s.age;
        }else {
            return this.name.compareTo(s.name);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//implement comparator interface
class Compare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}

public class CollectionSortTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(17);
        list.add(11);
        list.add(28);
        list.add(3);
        list.add(16);

        List<String> listStr = new ArrayList<>();
        listStr.add("Mike");
        listStr.add("Jenny");
        listStr.add("Henry");
        listStr.add("Kim");
        listStr.add("Byran");
        listStr.add("Tom");
        listStr.add("Han");

        Collections.sort(listStr, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });

        for (int i = 0 ; i < listStr.size(); i++) {
            System.out.println(listStr.get(i));
        }

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(20, "Mike"));
        studentList.add(new Student(18, "Henry"));
        studentList.add(new Student(25, "Byran"));
        studentList.add(new Student(17, "Tom"));
        studentList.add(new Student(17, "Han"));

        Collections.sort(studentList);

        for (int i = 0; i < studentList.size(); i++) {
//            System.out.println(studentList.get(i));
        }
    }
}
