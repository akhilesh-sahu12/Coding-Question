package com.akhil;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        // System.out.println(list);
        triplets(list);
    }

    private static void triplets(ArrayList<Integer> list) {
        for(int i=0; i< list.size()-2; i++){
            int a= list.get(i);
            for (int j=i+1; j< list.size()-1; j++){
                int b= list.get(j);
                int diff=b-a;
                for (int k = j+1; k <list.size(); k++) {
                    int diff1=list.get(k)-b;
                    if(diff==diff1){
                        System.out.println(a+" "+b+" "+ list.get(k));
                    }
                    if(diff1>diff){
                        break;
                    }
                }
            }
        }

    }
}
