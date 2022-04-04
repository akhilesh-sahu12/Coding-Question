package com.akhilesh;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data=new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full!");
            return false;
        }

        data[end++]=item;
        return true;
    }

    public int remove() throws StackException {
        if(isEmpty()){
            throw new StackException("Queue is Empty!");
        }
        int removed=data[0];
        for (int i = 1; i <end ; i++) {
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("can not peek!");
        }
        return data[end];
    }

    public boolean isFull() {
        return  end==data.length;
    }

    public boolean isEmpty() {
        return  end==0;
    }

    public int front() throws StackException {
        if(isEmpty()){
            throw new StackException("can not peek!");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.println(data[i]);
        }
    }
    public int size(){
        return end;
    }
}
