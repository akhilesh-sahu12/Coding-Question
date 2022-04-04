package com.akhilesh;
import java.util.*;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(11);
        queue.add(22);
        queue.add(33);
        queue.add(44);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.size());

    }


}
