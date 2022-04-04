package com.company;

import java.util.Stack;

public class ByReversingTHeList {
    static boolean isPalindrom(Node head){
        Node l=head;
        boolean ispalindrome=true;
        Stack<Integer> stack=new Stack<>();//TC =O(n)
        while(l!=null){
            stack.push(l.data);
            l=l.next;
        }
        while(head!=null){
            int i=stack.pop();
            if(head.data==i) {
                ispalindrome = true;
            }
            else{
                ispalindrome=false;
                break;
            }
            head=head.next;
        }
        return ispalindrome;
    }

    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(2);
        Node n4=new Node(1);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        boolean res=isPalindrom(n1);
        System.out.println(res);
    }
}


