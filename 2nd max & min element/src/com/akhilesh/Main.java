package com.akhilesh;

public class Main {
    public static void main(String[] args) {
        int arr[] = {6,55,676,3,75,777,70,90,90,465775,55};
        s_Max(arr);
        s_Min(arr);
    }
    static void s_Max(int arr[]){
        int c_max =arr[0] ;
        int p_max = arr[0];
        if (arr.length == 1) {

            System.out.println("Not possible");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>c_max) {
                    p_max = c_max;
                    c_max = arr[i];

                }
                else if(arr[i]>p_max)
                    p_max=arr[i];
                else
                    continue;
            }
            System.out.println(c_max+" "+p_max);

        }
    }
    static void s_Min(int arr[]) {
        int c_min = arr[0];
        int n_min = arr[0];
        if (arr.length == 1) {

            System.out.println("Not possible");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < c_min) {
                    n_min = c_min;
                    c_min = arr[i];

                } else if (arr[i] < n_min)
                    n_min = arr[i];
                else
                    continue;
            }
            System.out.println(c_min + " " + n_min);

        }
    }
}




