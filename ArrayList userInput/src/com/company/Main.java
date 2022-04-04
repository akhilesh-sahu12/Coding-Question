package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer>list=new ArrayList<>();
	while(sc.hasNextInt()){
	  //  int num= sc.nextInt();
	  //  list.add(num);
        list.add(sc.nextInt());
    }
        for (int i:list) {

            System.out.println(list);
        }
    }
}
