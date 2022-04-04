package com.Akhilesh_Sahu;

public class Min3Max3 {
    public static void main(String[] args) {
        int[] arr = {76,44,3,5,6,45,65,332};
        min3Max3(arr);

    }

    static void min3Max3(int[] arr) {
       /* int min1 = Integer.MAX_VALUE;
        int min2 =Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min1) {
                int temp=min1;
                min1 = arr[i];
                min3=min2;
                min2=temp;

            }
            else if(arr[i]<=min2){
                int temp=min2;
                min2=arr[i];
                min3=temp;
            }
            else if(arr[i]<=min3){
                min3=arr[i];
            }
            System.out.print(min1+" "+min2+" "+min3);
            }*/
    /*       int max1 = Integer.MIN_VALUE;
            int max2 =Integer.MIN_VALUE;
            int max3 = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= max1) {
                    int temp=max1;
                    max1 = arr[i];
                    max3=max2;
                    max2=temp;

                }
                else if(arr[i]>=max2){
                    int temp=max2;
                    max2=arr[i];
                    max3=temp;
                }
                else if(arr[i]>=max3){
                    max3=arr[i];
                }

        }
        System.out.print(max1+" "+max2+" "+max3);
    }*/
        int min1 = Integer.MAX_VALUE;
        int min2 =Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<=min3){
                if (arr[i] <= min1) {
                    int temp=min1;
                    min1 = arr[i];
                    min3=min2;
                    min2=temp;

                }
                else if(arr[i]<=min2){
                    int temp=min2;
                    min2=arr[i];
                    min3=temp;
                }
                else if(arr[i]<=min3){
                    min3=arr[i];
                }
            }
            if(arr[i]>=max3){
                if (arr[i] >= max1) {
                    int temp=max1;
                    max1 = arr[i];
                    max3=max2;
                    max2=temp;

                }
                else if(arr[i]>=max2){
                    int temp=max2;
                    max2=arr[i];
                    max3=temp;
                }
                else if(arr[i]>=max3){
                    max3=arr[i];
                }

            }

        }
        System.out.print(min1+" "+min2+" "+min3+" "+max1+" "+max2+" "+max3);

    }
}