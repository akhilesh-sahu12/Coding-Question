package com.Placement;

import java.util.ArrayList;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberOfJump(n));
        String s=sc.next();
        String str=" ";
        subsequance(s,str,0);
        // String i;
    }
        /*int n=sc.nextInt();
       // String i;
        ArrayList<Integer>input=new ArrayList<>();
        for (int j=0; j<n; j++)
        {
           int num=sc.nextInt();
           input.add(num);

        }
        ArrayList<Integer>output=new ArrayList<>();
        subset(input,output,0);
    }
    static void subset(ArrayList<Integer> input, ArrayList<Integer>output, int index){
        if(index>=input.size()){
            for (int i:output) {
                System.out.print(i+" ");
            }
            return;

        }
        subset(input,output,index+1);

        output.add(input.get(index));
        subset(input,output,index+1);
    }

*/
    static int numberOfJump(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return numberOfJump(n-1)+numberOfJump(n-2)+numberOfJump(n-3);
    }
    static void subsequance(String input, String output ,int index){
        if(index>=input.length()){
          //  for (int i:output) {
                System.out.print(output+" ");
            return;
            }



        subsequance(input,output,index+1);

        (output,input[index]);
        subsequance(input,output,index+1);
    }


}
