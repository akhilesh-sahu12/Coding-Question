package com.placement;

import java.util.ArrayList;

public class MazeProblem {
 public static void main(String[] args){
     System.out.println(maze(3,3));
     path("",3,3);
     System.out.println(pathRet("",3,3));
     System.out.println(diagonal("",3,3));
 }

    private static int maze(int r, int c) {
     if(r==1 || c==1){
         return 1;
     }
     int left=maze(r-1,c);
     int right=maze(r,c-1);
     return left+right;
    }
    private static void path(String p,int r, int c) {
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1) {
            path(p + 'D', r - 1, c);
        }
        if(c>1) {
            path(p + 'R', r, c - 1);
        }
    }
    private static ArrayList<String> pathRet(String p, int r, int c) {
        if(r==1 && c==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();
        if(r>1) {
            list.addAll(pathRet(p + 'D', r - 1, c));
        }
        if(c>1) {
            list.addAll(pathRet(p + 'R', r, c - 1));
        }
       return list;
    }
    private static ArrayList<String> diagonal(String p,int r, int c) {
        if(r==1 && c==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(diagonal(p+'D',r-1,c-1));
        }
        if(r>1) {
            list.addAll(diagonal(p + 'V', r - 1, c));
        }
        if(c>1) {
            list.addAll(diagonal(p + 'H', r, c - 1));
        }
        return list;
    }

}
