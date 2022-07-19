package com.ssi.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("123");
        set.add("456");
        set.add("123");


        for (String str : set) {
            System.out.println(str);
        }

        System.out.println(set.size());
    }
}
