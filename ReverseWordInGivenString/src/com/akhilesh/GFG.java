package com.akhilesh;// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        StringBuilder sb=new StringBuilder("");
        String[] arr=S.split("\\.");
       // System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1; i>0; i--){
           sb.append(arr[i]+".");
       }
        sb.append(arr[0]);
        return sb.toString();
    }
}