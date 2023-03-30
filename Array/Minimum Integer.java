import java.io.*;
import java.util.*;



class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        
        Solution obj = new Solution();
        int res = obj.minimumInteger(N, A);
        
        System.out.println(res);
    }
}


class Solution {
    public static int minimumInteger(int N, int[] A){
        // code here
        
        long sum = 0;
        int x = Integer.MAX_VALUE;
        //find sum
        for(int i=0; i<N; i++){
            sum += A[i];
        }
        
        for(int i=0; i<N; i++){
            // if sum <= N*X
            // using log formula log(m*n) = log m + log n
            if(Math.log(sum) <= Math.log(N) + Math.log(A[i])){
                //find the minimum integer X
                x = Math.min(x, A[i]);
            }
        }
        
        return x;
    }
}
        
