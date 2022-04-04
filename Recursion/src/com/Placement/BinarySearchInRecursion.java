package com.Placement;
// Binary Search->
//                3 6 9 7 12 30 45 67 89
//                search= 89
//                1) find mid (dividing into 2 half)
//                      3 4 9 7  12  30 45 67 89
//                2) comparing mid value to search value
//                      if(arr[mid]==search)
//                           return mid;
//                      else if(arr[mid]<search)
//                           start=mid+1;
//                      else
//                           end=mid-1;
//                 until start>end
//                 3) if search value not present in arr
//                        return -1
//Recurrence Relation f(n)=f(n/2)+o(1)
//                            /    \
//                 dividing arr    comparing
//  Type of recurrence relation ->
//                              1) Linear recurrence relation(fibonacci)
//                              2) Divide & Conquer recurrence relation(Binary Search)
//                                       (reduce by facter)
//

public class BinarySearchInRecursion {
    public static void main(String[] args) {
     int arr[]={1, 3 ,6 ,7 ,9,12, 56};
     int target=56;
     int s=0;
     int e=arr.length-1;
     int res=search(arr,target,s,e);
        System.out.println(res);

    }
    static int search(int arr[], int target,int s, int e){
        if(s>e) {
            return -1;
        }
        int m=(s+e)/2;
        if(arr[m]==target)
            return m;
        else if(arr[m]>s)
            return search(arr,target,m+1, e);
        else
         return search(arr,target,s, m-1);
    }
}
