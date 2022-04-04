package com.placement;
// TC= O(log n)
public class Main {
    public static void main(String[] args) {
	int n=40;
    int p=3;
    double res=findSqrt(n, p);
	System.out.println(res);
       // System.out.printf("%.3f", findSqrt(n,p));

    }

    private static double findSqrt(int n, int p) {
        int start=0;
        int last =n;
        double root=0.0;
        while (start<=last){
            int mid=start+(last-start)/2;
            if(mid*mid==n){
               return  mid;
            }
             if(mid*mid>n)
                last=mid-1;
            else
                start=mid+1;


        }
        root=last;
        double inc=0.1;
        for (int i = 0; i < p; i++) {
            while (root*root<=n){
                root+=inc;
            }
            root-=inc;
            inc/=10;
        }
       return root;
    }
}
