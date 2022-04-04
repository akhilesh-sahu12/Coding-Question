package com.akhilesh;

import java.util.*;
class Solutation{
static int minCost(int A[], int n) 
{ 

    // Initialize cost to 0 

    int cost = 0; 
 

    // Sort the array 

    Arrays.sort(A); 
 

    // Middle element 

    int K = A[n / 2]; 
 

    // Find Cost 

    for (int i = 0; i < n; ++i) 

        cost += Math.abs(A[i] - K); 
 

    // If n, is even. Take minimum of the 

    // Cost obtained by considering both 

    // middle elements 

    if (n % 2 == 0) { 

        int tempCost = 0; 
 

        K = A[(n / 2) - 1]; 
 

        // Find cost again 

        for (int i = 0; i < n; ++i) 

            tempCost += Math.abs(A[i] - K); 
 

        // Take minimum of two cost 

        cost = Math.min(cost, tempCost); 

    } 
 

    // Return total cost 

    return cost; 
} 
 
// Driver Code 

public static void main(String[] args) 
{ 

    int A[] = { -2185, 2309, -5600, 2776, 2788 }; 
 

    int n = A.length; 
 

    System.out.println(minCost(A, n)); 
}
} 