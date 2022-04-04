package com.akhilesh;// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        return find(S,"");
        
    }
     public List<String> find(String s, String ans){
         if(s.isEmpty()){
             ArrayList<String>list=new ArrayList<>();
             list.add(ans);
             return list;
         }
         ArrayList<String>list=new ArrayList<>();
         for(int i=0; i<s.length(); i++){
             char ch=s.charAt(i);
            String l=s.substring(0,i);
            String r=s.substring(i+1);
            String res=l+r;
            list.addAll(find(res, ans+ch));
         }
         return list;
         
     }
}
