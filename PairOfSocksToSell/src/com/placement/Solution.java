package com.placement;

import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1; i<=t; i++){
            int leng=sc.nextInt();
            String houses=sc.next();
            //System.out.println(houses);
            int left=0, right=0;
            int fin=0;
            int sum=0;
            char ch='1';
            char[] ar=houses.toCharArray();
            for (int j = 0; j < ar.length; j++) {
                char cha=ar[j];
                if(cha==ch){
                    break;
                }
                else{
                    for (int k = j-1; k >=0 ; k--) {
                        if(houses.charAt(k)=='1') {
                            left++;
                            break;
                        }
                        else
                            left++;
                    }
                    for (int k = j+1; k < leng; k++) {
                        if(houses.charAt(k)=='1') {
                            right++;
                            break;
                        }
                        else
                            right++;
                    }
                    //sum+=fin;


                }
                fin=Math.min(left,right);

            }
            System.out.println(fin);
        }
    }
}