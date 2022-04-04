package com.company;
import java.util.stream.IntStream;
import java.util.*;
public class Main {
 static int minPages(int a[],int k){
    int min=Arrays.stream(a).max().getAsInt();
    int max= IntStream.of(a).sum();
    int res=0;
    while (min <= max) {

        int mid=(min+max)/2;
        if(isfeasible(a,k,mid)){
            res=mid;
            max=mid-1;
        }
        else{
            min=mid+1;
        }
    }
    return res;

}
 static boolean isfeasible(int a[], int k, int res){
    int student=1,sum=0;
    for(int i=0; i<a.length; i++)
    {
        if(sum+a[i]>res){
            student++;
            sum=a[i];
        }
        else{
            sum+=a[i];
        }
    }
     return student<=k;

 }

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	/*ArrayList<Integer> list=new ArrayList<>();
	while(sc.hasNextInt());
        {
            list.add(sc.nextInt());
            a=list.stream().mapToInt(i->i).toArray();
        }
*/
        int n=sc.nextInt();
        int[] a=new int[n];

        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k= sc.nextInt();
        int result=minPages(a,k);
        System.out.println(result);
    }
}
