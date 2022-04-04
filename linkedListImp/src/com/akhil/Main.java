package com.akhil;

import java.util.LinkedList;

// 3->4->5->1->4->8
public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insertFirst(6);
        list.insertFirst(9);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(99);
        list.insertFirst(22);
        list.insertFirst(44);
        list.insertFirst(9876);
        list.insertFirst(98765);
        list.insertLast(99);
        list.insert(100,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        System.out.println(list.find(1));
    }
}
