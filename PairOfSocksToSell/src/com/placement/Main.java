package com.placement;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        int pair=socksMarket1(arr,n);
        System.out.println(pair);

    }

    private static int socksMarket1(int[] arr, int n) {
        int freq[]=new int[101];
        int pair=0;
        for (int i = 0; i < n; i++) {//arr[]={3,5,8,1,9,1,0,2,5,5,5}
             freq[arr[i]]++;// [1,2,1,1,0,4,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0....(101) 0's}
        }
        System.out.println(Arrays.toString(freq));
        for (int i = 0; i < 101; i++) {
            pair+=freq[i]/2;

        }

        return pair;
    }

    private static int socksMarket(int[] arr, int n) {
        int pair=0;
        Map<Integer,Integer>map=new HashMap<>();
        for (int i: arr) {
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else
                map.put(i,1);
        }

        for(int i=0; i<n; i++) {
            if(map.get(arr[i])>1){
               pair += (map.get(arr[i]) / 2);
               map.put(arr[i], 0);
            }
        }
        return pair;
    }
}
