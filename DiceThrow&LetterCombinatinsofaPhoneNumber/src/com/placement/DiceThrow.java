package com.placement;

import java.util.ArrayList;

public class DiceThrow {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(diceRet("",4));
        diceFace("",7,8);
        System.out.println(diceRetFace("",7,8));
    }

    private static void dice(String p, int target) {
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 & i<=target ; i++) {
            dice(p+i,target-i);
        }
    }
    private static ArrayList<String> diceRet(String p, int target) {
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for (int i = 1; i <=6 & i<=target ; i++) {
            list.addAll(diceRet(p+i,target-i));
        }
        return list;
    }
    private static void diceFace(String p, int target, int face) {
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=face & i<=target ; i++) {
            diceFace(p+i,target-i, face);
        }
    }
    private static ArrayList<String> diceRetFace(String p, int target, int face) {
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for (int i = 1; i <=face & i<=target ; i++) {
            list.addAll(diceRetFace(p+i,target-i,face));
        }
        return list;
    }
    private static ArrayList<String> dice(String p, int target, int face) {
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for (int i = 1; i <=face & i<=target ; i++) {
            list.addAll(diceRetFace(p+i,target-i,face));
        }
        return list;
    }

}
