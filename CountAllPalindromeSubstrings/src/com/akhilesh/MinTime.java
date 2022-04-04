package com.akhilesh;

import java.util.*;

public class MinTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cost1=sc.nextInt();
        int cost2=sc.nextInt();
        int totalVillages=sc.nextInt();
        int arr[]=new int[totalVillages];
        for(int i=0; i<totalVillages; i++){
            arr[i]= sc.nextInt();
        }
        mTime(cost1, cost2, totalVillages, arr);
    }
    public static void mTime(int cost1, int cost2, int totalVillages, int[] arr){
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int total_sum=0;
        for(int i=0; i<totalVillages; i++){
            total_sum+=arr[i];
        }
        System.out.println(total_sum);
        float midCost=(cost1+cost2)/2;
        System.out.println(midCost);
        float mid=(total_sum*midCost)/2;
        System.out.println(mid);
        int curr_sum=0;
        int s=0;
        do {
            curr_sum += (arr[s] * cost1);
            list1.add(arr[s]);
            s++;
        }while (curr_sum<mid);
        System.out.println(curr_sum);
        for (int i = s; i <totalVillages; i++) {
         list2.add(arr[i]);
        }
       System.out.println(list1);
        System.out.println(list2);
    }
}