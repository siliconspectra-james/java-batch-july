package com.ssi.java8;

import java.util.HashMap;
import java.util.Map;

public class ForeachTest {


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("123","Mike");
        map.put("345","Mike");
        map.put("678","Mike");
        map.put("321","Mike");
        map.put("100","Mike");


        map.forEach((k,v) -> {

            System.out.println(k);
            System.out.println(v);
        });
    }

}
