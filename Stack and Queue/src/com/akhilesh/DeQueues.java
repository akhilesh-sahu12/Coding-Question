package com.akhilesh;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueues {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(8);
        deque.addFirst(7);
        deque.addLast(9);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
    }
}
