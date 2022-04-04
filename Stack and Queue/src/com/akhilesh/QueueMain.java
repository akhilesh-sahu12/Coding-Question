package com.akhilesh;

public class QueueMain {
    public static void main(String[] args) throws StackException{
        CustomQueue queue=new CustomQueue(5);
        queue.insert(11);
        queue.insert(22);
        queue.insert(33);
        queue.insert(44);
        queue.insert(77);

        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.size());
    }
}
