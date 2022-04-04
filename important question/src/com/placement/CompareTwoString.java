package com.placement;

public class CompareTwoString {
    public static void main(String[] args) {
        String name="Akhilesh";
        String name1="Akhilesh";
        if(name==name){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
        if(name.compareTo(name1)==0){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
        if(name.equals(name1)){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
        String name2=new String("Akhilesh");
        String name3=new String("Akhilesh");
        if(name2==name3){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
        if(name2.compareTo(name3)==0){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
        if(name2.equals(name3)){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}
