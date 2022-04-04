package com.Placement;
// Recursion             -> Function calling itself.
// Why Recursion ?       -> It help us in solving bigger/complex problem in a simple way.
//                       -> You can convert recursion solution into iteration & vice versa.
// When Use Recursion -> It helps in breaking down bigger problem into smaller problems.
// Base condition in Recursion -> Condition where are recursion will stop making new calling
//      No base condition =   1 ->  function calls will keep happening
//                            2 -> Stack filled again and again
//                            3 -> Every call of function will take some memory
//                          = Memory of Computer will exceed the limit -> stack
//                          -> StackOverFlow
// *** we will visualise recursion through Recursion Tree.
// Disadvantage -> Space Complexity is not constant because of recursive calls.


// How to solve Problem ->
//***       ->Break it down into smaller problem
//          ->Identify if you can break down problem into smaller problems
//          ->Write the recurrence relation if needed
//          ->Draw the recursive tree
//  About the tree ->
//                 -> See the flow of function, how they are getting in stack
//                 -> identify and focused left tree calls and right tree calls
//                 -> Draw the tree and pointers again and again using pen & paper
//                 -> Use a debugger to see the flow
//          ->See how the value are returned at each step.
//          ->See where the function call will come out
//          ->And, You will come out of the value



// Working with Variable in Recursion ->
//                           1)-> Arguments
//                           2)->Return Type
//                           3)->Body function
//
import java.util.*;
public class Main {

    public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();

	int res=fact(n);
	    System.out.println(res);
    String s[]={"zero","one","two","three","four","five","six","seven", "eight", "nine"};
    angrezi(n,s);
    int res2=pow(n);
        System.out.println(res2);
    /*int arr[]=new int[n];
    for (int i=0; i<n;i++){
        arr[i]= sc.nextInt();}
    boolean res3=sorted(arr,1);
        {
        System.out.println(res3);}*/
    ArrayList<Integer>input=new ArrayList<>();
        for (int j=0;j<n;j++) {
            input.add(j);
        }
        ArrayList<Integer>output=new ArrayList<>();
    subset(input,output,0);
    }
    static int fact(int n){
        if(n<=1)
            return 1;
      //  int re=fact(n-1);
       // int ans=n*fact;
        return n*fact(n-1);


    }

    static void angrezi(int n, String s[]){
        if(n==0)
            return ;
        angrezi(n/10,s);
        System.out.print(s[n%10]+" ");

    }
    static int pow(int n){
        if(n==0)
            return 1;
        return 2*pow(n-1);
    }
    static int pow1(int n){
        if(n==0)
            return 1;
        int ans=pow1(n/2);
        if((n&1)==0){
            return 2*ans*ans;}
        return ans*ans;

       // return 2*pow(n-1);
    }
    /*static boolean sorted(int arr[],int index){
        if(index>=arr.length)
            return true;
        if(arr[index]<arr[index-1])
            return false;
        return sorted(arr,index+1);

    }*/
    static void subset(ArrayList<Integer>input,ArrayList<Integer>output,int index){
        if(index>=input.size()){
            for (int i:input) {
                System.out.print(i+" ");
            }
            return;

            }
        subset(input,output,index+1);
        output.add(input.get(index));
        subset(input,output,index+1);
        }

    }

