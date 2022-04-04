package com.akhilesh;

public class Main {
    // head->3-> 4-> 5-> 1-> 18->null<-tail
    public static void main(String[] args) {
//	   CustomLL list=new CustomLL();
//
//       list.insertFirst(56);
//       list.insertFirst(97);
//       list.insertFirst(87);
//       list.insertFirst(8);
//
//       list.display();
//
//       System.out.println(list.checkTail());
//
//        System.out.println(list.checkHead());
//
//        list.insertLast(9);
//        list.insertLast(10);
//        list.insertLast(11);
//
//        list.display();
//
//        System.out.println(list.checkTail());
//        System.out.println(list.checkHead());
//
//        list.insert(1,3);
//        list.display();
//
//        list.insert(1, 5);
//        list.display();
//
//        System.out.println(list.deleteFirst());
//        list.display();
//
//        System.out.println(list.deleteLast());
//        list.display();
//
//        System.out.println(list.delete(4));
//        list.display();
//
//        System.out.println(list.find(9));
//

//        DoublyLL list=new DoublyLL();
//        list.insertFirst(56);
//        list.insertFirst(97);
//        list.insertFirst(87);
//        list.insertFirst(8);
//        list.insertLast(9);
//        list.insertLast(9);
//        list.insertLast(10);
//        list.insertLast(11);
//        list.insertLast(12);
//        list.display();

        CircularLL list=new CircularLL();
        list.insert(56);
        list.insert(97);
        list.insert(87);
        list.insert(8);
        list.insert(9);
        list.insert(9);
        list.insert(10);
        list.insert(11);
        list.insert(12);
        list.display();
        list.delete(9);
        list.display();
    }
}
