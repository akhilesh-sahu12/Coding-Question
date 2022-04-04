package com.akhilesh;

import java.util.*;
public class Solution
{
	public static void main(String[] args) {
	    int[] arr1={1,1,2,2,3,3};
	    int[] arr2={1,1,2,3,5};
		System.out.println(minDeletion(arr1));
		System.out.println(minDeletion(arr2));
	}
	    public static int minDeletion(int[] nums) {
        int count=0;
 
        for(int i=0; i<nums.length-count; i++){
            boolean flag=true;
            if(i%2==0 && nums[i]==nums[i+1]){
                for(int j=i+1; j<nums.length-1-count; j++){
                    nums[j]=nums[j+1];
                }
                count++;
                flag=false;
            }
            System.out.println(Arrays.toString(nums));
            if(flag){
                 if(nums.length-count%2!=0){
                     return count+1;
                 }
                else{
                    return count;
                }
            }
        }
        
        return count;
    }
}
