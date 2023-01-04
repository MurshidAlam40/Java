import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int M[][] = new int[N][N];
        String arr[] = in.readLine().trim().split("\\s+");
        for(int i = 0;i < N*N; i++)
            M[i/N][i%N] = Integer.parseInt(arr[i]);
            
        Solution ob = new Solution();
        System.out.println(ob.distinct(M, N));
    }
}


class Solution{
    static int distinct(int M[][], int N)
    {
        // code here
        HashMap<Integer,Integer> remove = new HashMap<>();

        for(int i=0; i<N; i++){
           if(remove.containsKey(M[0][i]) == false){
                  remove.put(M[0][i], 1);
           }
        }
        for(int i=1; i<N; i++){
           for(int j=0; j<N; j++){
               if(remove.containsKey(M[i][j]) == true && remove.get(M[i][j]) == i){
                   int temp = remove.get(M[i][j]);
                       remove.put(M[i][j], temp + 1);
               }
           }
        }
        
        int count = 0;
        Set<Integer> s1 = remove.keySet();
        
        for(int i : s1){
           if(remove.get(i) == N){
               count++;
           }
        }
        return count;
    }
}
