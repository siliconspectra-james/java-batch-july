package com.ssi.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


class Data {
    String id;
    String name;

    public Data(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Data d = (Data) o;
        return d.id.equals(this.id) && d.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class MapTest {

    public static void main(String[] args) {

/*        Map<Data, String> map = new HashMap<>();
        map.put(new Data("1001", "Han"), "Backend");
        map.put(new Data("1001", "Han"), "Frontend");

        System.out.println(map.size());*/

        Map<String, String> map = new HashMap<>();
        map.put("123","Mike");
        map.put("345","Mike");
        map.put("678","Mike");
        map.put("321","Mike");
        map.put("100","Mike");

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
