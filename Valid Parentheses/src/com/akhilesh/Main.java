package com.akhilesh;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	System.out.println(isValids("(({[]}))"));
    }
    public static boolean isValids(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else{
                char ch=s.charAt(i);
                if(ch=='('){

                }
                if(stack.peek()!=s.charAt(i)){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.size()==0;

    }
}
