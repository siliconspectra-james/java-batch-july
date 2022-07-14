package com.ssi.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(11);

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

        for (Integer i : arrayList) {
            System.out.println(i);
        }

//        Iterator<Integer> iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        arrayList.remove(0);
//        arrayList.remove((Integer) 10);


    }
}
