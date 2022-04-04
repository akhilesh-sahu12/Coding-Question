package com.akhil;

import java.util.Arrays;

public class WildcardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildcardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    private void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp= new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
    private T remove() {
     //  T removed=(T)data[--size];
        T removed=(T)data[size];
        data[size]=null;
        --size;
        return removed;
    }
    private T get(int index) {
        return (T)data[index];
    }
    private int size() {
        return size;
    }
    private void set(int index, T value) {
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{"+
                "data="+Arrays.toString(data)+
                ", size= "+size+"}";
    }

    public static void main(String[] args) {
        WildcardExample<Integer> list1 = new WildcardExample();

       /* list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");*/
        for (int i = 0; i < 12; i++) {
            list1.add(i*2);
        }

        list1.remove();
        list1.get(0);
        list1.size();


        //list1.set(1,"Akhi");
        // list.isEmpty();

        System.out.println(list1);
    }
}

