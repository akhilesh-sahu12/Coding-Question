package com.akhilesh;
import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KSmallestElement {
    public static void main(String[] args) {
        int[] arr={12,4,45,5,89,34,2,7};
        int k=4;
        PriorityQueue<Integer>queue=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer>queue1=new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            System.out.println(queue);
            queue1.add(arr[i]);
            System.out.println(queue1);
        }
    }
}
