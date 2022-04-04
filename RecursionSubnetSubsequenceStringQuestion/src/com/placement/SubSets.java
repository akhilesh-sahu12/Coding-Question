package com.placement;
import java.util.*;
// Permutations & Combinations
// Subsets -> Non adjacent collections
//    [3,5,9] -> [3], [3,5], [3,9], [3,5,9], [5,9], [5], [9]
// Recursion & iteration


// abc -> ["a", "b", "c", "ab", "ac","bc", "abc"]
//                            abc
//                           /   \
//                      a/bc      ""/bc
//                    /   \        /    \
//                ab/c    a/c     b/c  ""/c
//               /    \   /  \    /  \  /  \
//             abc/ ab/ ac/  a/ bc/ b/ c/   /

   public class SubSets {
      public static void main(String[] args) {
         subseq("","abc");
         System.out.println(subseqRet("","abc"));
      }
      static void subseq(String p, String up){
         if(up.isEmpty()){
            System.out.println(p);
            return;
         }
         char ch=up.charAt(0);
         subseq(p+ch, up.substring(1));
         subseq(p,up.substring(1));
      }
      static ArrayList<String> subseqRet(String p, String up){
         if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
         }
         char ch=up.charAt(0);
         ArrayList<String>left=subseqRet(p+ch, up.substring(1));
         ArrayList<String>right=subseqRet(p,up.substring(1));
         left.addAll(right);
         return left;
      }
}
