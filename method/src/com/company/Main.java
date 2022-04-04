package com.company;
import java.util.*;


class Another{
    public static void s(){
        System.out.println("this is another class");

    }

    }


public class Main {
// main method
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b1=x.nextInt();
        int c1=x.nextInt();
        float c=x.nextFloat();

        int result=fact(a);
        int power1=power(b1,c1);
        int res=maxOf(b1,c1);
        float r=maxOf(b1,c);
        System.out.println(res);
        System.out.println(r);
	System.out.println(result);
	System.out.println(power1);
	hi();
	hi();
	Another obj=new Another();
	obj.s();
	Dog h=new Dog();
            h.legs=4;
        Dog j=new Dog();
        j.legs=9;
	swap(h,j);
	System.out.println(h.legs+ " " + j.legs);
    }
    // pass by referance
   static int maxOf(int a, int b){
        if(a<b)
        {
            return a;
        }
        else{
            return b;
        }}
    // pass by referance
    static float maxOf(int a, float b){
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }}
   static int fact(int n)

  /*  {
        if(n<=1)
            return 1;
        else
            return (n*fact(n-1));
            }
   */
   {
       int facti=1;

       for(int i=1;i<=n;i++)
        {
            facti=facti*i;
        }
       return facti;
    }
    // pass by value
    static int power(int b,int c)
    {
        if(c==0)
            return 1;
        else
            return(b*power(b,c-1));
    }
   public static void hi()
    {
        System.out.println("Akhilesh");
        System.out.println("sys out");

    }

public static void swap(Dog h, Dog j){
       int temp=h;
       h=j;
       j=temp;
}

}
class  Dog{
    int legs;
}
