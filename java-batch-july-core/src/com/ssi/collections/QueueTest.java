package com.ssi.collections;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        System.out.println(queue.poll());


        Queue<Integer> priorityQueue = new PriorityQueue<>();
    }
}
