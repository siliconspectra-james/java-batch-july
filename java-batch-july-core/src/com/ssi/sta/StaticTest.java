package com.ssi.sta;

public class StaticTest {
    public static String name = "Mike";

    public Integer age = 20;


    public static String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void getID() {
        Integer id = 2;
    }

    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
        System.out.println(StaticTest.name);
        System.out.println(staticTest.age);

        StaticTest.getName();
        staticTest.getAge();
    }
}
