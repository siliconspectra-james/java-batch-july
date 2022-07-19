package com.ssi.java8;

import java.util.*;

public class LambdaTest {

    public static void main(String[] args) {

        //Comparator
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Han");
        list.add("Kim");

        Collections.sort(list, (s1, s2) -> s2.compareTo(s1));

        System.out.println(list);

    }
}
