package com.akhil;
/*
* 5 6  V E
* abcde V= 1 2 3 4 5
* 1 2  E-:
* 2 4        3->1->2->4->5->6->2
* 3 1
* 4 5
* 5 6
* 6 2
*/
import java.util.*;

public class Main {
   static ArrayList<Integer>[] graph;
   static int[] letter;
   static int[] visited;
   static int[][] memo;
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int v = obj.nextInt();
        int e = obj.nextInt();
        String s = obj.next();
        graph = new ArrayList[v + 1];
        for (int i = 0; i <= v; i++)
            graph[i] = new ArrayList<Integer>();
      //  for (int k = 0; k <= v; k++)
      //      System.out.println(graph[k]);
        for (int i = 0; i < e; i++)
        {
            int from = obj.nextInt();
            int to = obj.nextInt();
            graph[from].add(to);
          //  System.out.println(graph[from]);
        }

        letter = new int[v + 1];
        for(int i=1; i<=v; i++)
        letter[i] = s.charAt(i - 1) - 'a';
        for (int k = 1; k <= v; k++)
            System.out.println(letter[k]);
        visited = new int[v + 1];
        memo = new int[v + 1][26];
        for (int i = 1; i <= v; i++) {
            if (visited[i] == 0 && dfs(i)) {
                System.out.println("-1");
                System.exit(0);
            }
            }
            int answer=0;
            for (int i=1; i<=v; i++) {
                for(int j=0; j<26; j++)
                    answer=Math.max(answer, memo[i][j]);
            }
            System.out.println(answer);
        }



    public static boolean dfs(int vertex)
    {
        visited[vertex]=1;
        for (int to:graph[vertex])
        {
            if (visited[to]==1)
                return true;
            if (visited[to]==0 && dfs(to))
                return true;
            for(int i=0; i<26; i++)
                memo[vertex][i]=Math.max(memo[vertex][i],memo[to][i]);
        }
        memo[vertex][letter[vertex]]++;
        visited[vertex]=2;
        return false;


        }

    }

