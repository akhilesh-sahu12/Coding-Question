package com.Akhilesh_Sahu;

import java.util.*;

public class CountRangeElementsArray {
    public static void main(String[] args) {
        int[] arr={2,76,44,3,5,6,45,65,32,1,76,44,3,5,6,45,65,332,1,2,3,4,5,6,7,8,9,10};
        frequencyCheck(arr);
       // countfreq(arr);

    }

     static void frequencyCheck(int[] arr) {
        boolean visited[]=new boolean[arr.length];
        Arrays.fill(visited,false);
         for (int i = 0; i < arr.length ; i++) {
             if (visited[i]==true)
                 continue;
             int count=1;
             for (int j = 0; j < arr.length ; j++) {
                 if(arr[i]==arr[j])
                 {
                     visited[j]=true;
                     count++;
                 }
             }
            // System.out.println(Arrays.toString(visited));
             System.out.println(arr[i]+" "+count);

         }
    }
    static void countfreq(int[] arr){
        HashMap<Integer,Integer>freqMap=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
           if(freqMap.containsKey(arr[i])){
               freqMap.put(arr[i],freqMap.get(arr[i])+1);
           }
           else
               freqMap.put(arr[i],1);
        }
        for (Map.Entry entry:freqMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
              {

        }

    }
}
