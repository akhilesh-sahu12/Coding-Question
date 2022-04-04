package com.akhilesh;

public class CustomStack {
    protected  int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data=new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full!");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws StackException {
       if(isEmpty()){
           throw new StackException("can not pop!");
       }
     //  int removed=data[ptr];
     //  ptr--;
     //  return removed;
        return data[ptr--];
    }
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("can not peek!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return  ptr==data.length-1;
    }

  public boolean isEmpty() {
        return  ptr==-1;
    }



}
