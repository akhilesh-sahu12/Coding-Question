package com.company;

public class LinkedList {
    Node head;
    Node l_next, f_next, s_next;

    public class Node1 {
        int data;
        Node next;

        Node(int data) {
            this.next = null;
            this.data = data;
        }
    }
}