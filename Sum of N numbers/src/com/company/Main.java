package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        // Define an array of integers of size N.
        int[] numArray = new int[N];


        int sum = 0;
        for(int i=0; i<N; i++)
            numArray[i] = s.nextInt(); // Get the input
        for(int i=0;i<N;i++)
        {
            sum+=numArray[i];
        }

        // Write the logic to add these numbers here:




        // Print the sum
        System.out.print(sum);
        s.close();
    }

}

