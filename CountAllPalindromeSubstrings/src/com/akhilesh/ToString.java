package com.akhilesh;

public class ToString
{
    public static void main(String[] args) {
        int arr[]={7,8,324,0,885};
        System.out.println(toString(arr));
    }
    static String toString(int arr[]){
        String res="";
        for (int i=0;i<arr.length;i++){
            res+=(i+" : "+arr[i]+"\n");
        }
        return res;
    }
}
