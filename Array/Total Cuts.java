import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int res = obj.totalCuts(N, K, A);
        
        System.out.println(res);
            
    }
}


class Solution {
    public static int totalCuts(int N, int K, int[] A) {
        // code here
        int right[] = new int[N];
        int left[] = new int[N];
        //Add all largest element in the left array
        left[0] = A[0];
        for(int i=1; i<N; i++){
            left[i] = Math.max(left[i-1], A[i]);
        }
        //Add all smallest element in the right array
        right[N-1] = A[N-1];
        for(int i=N-2; i>=0; i--){
            right[i] = Math.min(right[i+1], A[i]);
        }
        //if  Sum of the largest element in the left part 
        //and the smallest element in the right part is greater than or equal to K
        // than count++
        int count = 0;
        for(int i=1; i<N; i++){
            if(left[i-1] + right[i] >= K){
                count++;
            }
        }
        return count;
    }
}
