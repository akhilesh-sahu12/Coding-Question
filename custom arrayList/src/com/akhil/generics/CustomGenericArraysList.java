package com.akhil.generics;

import java.util.Arrays;

public class CustomGenericArraysList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArraysList() {
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
       T removed=(T)data[--size];
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
        CustomGenericArraysList<String> list1 = new CustomGenericArraysList();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.remove();
        list1.get(0);
        list1.size();
        list1.set(1,"Akhi");
        // list.isEmpty();

        System.out.println(list1);
    }
}

