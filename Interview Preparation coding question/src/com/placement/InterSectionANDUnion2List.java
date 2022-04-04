package com.placement;

import java.util.*;
//element in every array are distinct
public class InterSectionANDUnion2List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1 ={1,2,5,6,2,3,5,7,3};
        int[] arr2 ={2,4,5,6,8,9,4,6,5,4};
        getInterSection(arr1,arr2);
        System.out.println();
        getUnion(arr1,arr2);

    }

    private static void getInterSection(int[] arr1, int[] arr2) {
        Set<Integer>set=new HashSet<>();
        for (int num:arr1) {
            set.add(num);
        }
        for (int num:arr2) {
            if(set.contains(num)){
                System.out.print(num+" ");
                set.remove(num);
            }
        }
    }

    private static void getUnion(int[] arr1, int[] arr2) {
        Set<Integer>set=new HashSet<>();
        for (int num:arr1) {
            set.add(num);
        }
        for (int num:arr2) {
            set.add(num);
        }
        for (int i:set) {
            System.out.print(i+" ");
        }
    }


    /*private static void getInterSection(int[] arr1, int[] arr2) {
        List<Integer>list=new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
          list.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (list.contains(arr2[i])){
                System.out.print(arr2[i]+" ");
               // list.remove(arr2[i]);
            }

        }

    }

    private static void getUnion(int[] arr1, int[] arr2) {
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        for (int i = 0; i <arr2.length ; i++) {
            if(list.contains(arr2[i])){
                continue;
            }
            else
                list.add(arr2[i]);
        }
        for (int num:list) {
            System.out.print(num+" ");
        }


    }*/
}
