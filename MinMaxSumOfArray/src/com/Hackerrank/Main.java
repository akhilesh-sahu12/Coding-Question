package com.Hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        Result.miniMaxSum(arr);

        bufferedReader.close();
    }

    private static void miniMaxSum(List<Integer> arr) {
        int max=arr.get(0);
        int min=arr.get(0);
        long sum=0;
        for (int i=0;i<arr.size(); i++){
            sum+=arr[i];
            if(arr.get(i)>max)
                max=arr.get(i);
            else
            if(arr.get(i)<min)
                min=arr.get(i);

        }
        System.out.print((sum-max)+" "+(sum-min));

    }
}
