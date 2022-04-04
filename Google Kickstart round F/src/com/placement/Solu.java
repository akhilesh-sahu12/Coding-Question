package com.placement;
import java.util.*;
class Solu{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1; i<=t; i++){
            int totalAnimals=sc.nextInt();
            int dFood=sc.nextInt();
            int cFood=sc.nextInt();
            int extra=sc.nextInt();
            String animals=sc.next();
            String ans=solve(totalAnimals,dFood,cFood, extra,animals);
            System.out.println("Case #"+i+": "+ans);
        }
        
    }
    static String solve(int totalAnimals,int dFood,int cFood, int extra, String animals){
        for(int i=0; i<totalAnimals; i++){
            if(dFood!=0 && cFood>=0){
              if(animals.charAt(i)=='D'){

                   cFood+=extra;
                      dFood-=1;
              }
              else{
                              cFood -= 1;
              }
            }
            else{

            if(i<totalAnimals ){
                if(animals.charAt(i)=='D')
                 return "NO";
            }
        }
            
        }
        return "YES";
    }
}