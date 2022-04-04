package com.placement;

public class OccurenceOfDigit {
    public static void main(String[] args) {
        int lower=1;
        int upper=10;
        int digit=1;
        ocurence(lower,upper,digit);
    }

    private static void ocurence(int lower, int upper, int digit) {
        int count=0;
        for (int i = lower; i <=upper; i++) {
            int temp=i;
            while (temp>0){
                int d=temp%10;
                if(d==digit)
                    count+=1;
                temp/=10;
            }

        }
        System.out.println(count);
    }
}
