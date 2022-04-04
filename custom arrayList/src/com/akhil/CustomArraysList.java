package com.akhil;

import java.util.Arrays;

public class CustomArraysList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArraysList() {
        this.data = new int[DEFAULT_SIZE];
    }

    private void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int temp[] = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
    private int remove() {
        int removed=data[--size];
        return removed;
    }
    private int get(int index) {
        return data[index];
    }
    private int size() {
        return size;
    }
    private void set(int index, int value) {
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{"+
                "data="+Arrays.toString(data)+
                ", size= "+size+"}";
    }

    public static void main(String[] args) {
        CustomArraysList list = new CustomArraysList();
        list.add(34);
        list.add(8765);
        list.remove();
        list.get(0);
        list.size();
        list.set(1,687);
        // list.isEmpty();

        System.out.println(list);
    }
}

