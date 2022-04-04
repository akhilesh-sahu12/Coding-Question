package com.Placement;
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
                A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
            int Q = Integer.parseInt(br.readLine().trim());
            int[][] P = new int[Q][3];
            for(int i_P = 0; i_P < Q; i_P++)
            {
                String[] arr_P = br.readLine().split(" ");
                for(int j_P = 0; j_P < arr_P.length; j_P++)
                {
                    P[i_P][j_P] = Integer.parseInt(arr_P[j_P]);
                }
            }

            int[] out_ = query_game(N, A, Q, P);
            System.out.print(out_[0]);
            for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
            {
                System.out.print(" " + out_[i_out_]);
            }

            System.out.println();

        }

        wr.close();
        br.close();
    }
    static int[] query_game(int N, int[] A, int Q, int[][] P){

               // System.arraycopy(0,0);

         /*   if else(P[0][0]==2)
            {   int temp;
                temp=A[P[0][1]];
                A[P[0][1]]=A[P[0][2]];
                A[P[0][2]]=temp;
            }
            if else(P[0][0]==3)
            {
                A[0]= A [P[0][1]];
            }

        }*/
        System.out.println(N);
        System.out.println(Arrays.toString(A));
        System.out.println(Q);
        for (int i = 0; i <P.length; i++) {
            System.out.println(Arrays.toString(P[i]));
        }

        int[] result = {0};
        return result;

    }
}