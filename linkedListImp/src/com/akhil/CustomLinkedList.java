package com.akhil;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private  int size;
    public CustomLinkedList(){
        this.size=0;
    }

    public  void insertFirst(int val){
         Node node=new Node(val);
         node.next=head;
         head=node;
         if(tail==null){
             tail=head;
         }
         size+=1;
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val= tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }
    public int find(int value){
        int index=0;
        Node node=head;
        while (node!=null){
           if(node.value==value){
               return index;
           }
           index++;
           node=node.next;
        }
        return -1;
    }

    public Node get(int index){
        Node node=head;
        for (int i = 0; i <index; i++) {
            node=node.next;
        }
        return node;
    }
    public void display() {
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+"-> ");
            temp=temp.next;
        }

        System.out.println("END");
    }


}
