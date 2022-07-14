package com.ssi.oop;

interface Person {
    public void doWork();
    public void doWork(String name);
}

class Student implements Person {

    @Override
    public void doWork() {
        System.out.println("student is doing work");
    }

    @Override
    public void doWork(String name) {
        System.out.println("student: " + name +" is doing work");
    }
}

class Teacher implements Person{

    @Override
    public void doWork() {
        System.out.println("teacher is doing work");
    }

    @Override
    public void doWork(String name) {
        System.out.println("teacher: " + name +" is doing work");
    }
}

public class PolyTest {

    public void working(Person p) {
        p.doWork();
    }

    public void working(Person p, String name) {
        p.doWork(name);
    }


    public static void main(String[] args) {
        Person student = new Student();
        Person teacher = new Teacher();

        PolyTest polyTest = new PolyTest();
        polyTest.working(student, "Mike");
        polyTest.working(teacher, "Tom");
    }
}
