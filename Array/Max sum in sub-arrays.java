import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
            
        long[] arr =new long[(int)N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextLong();
        }
    
        Solution obj = new Solution();
        System.out.println(obj.pairWithMaxSum(arr, N));
        
    }
}

class Solution {
    
    public static long pairWithMaxSum(long arr[], long N)
    {
        // Your code goes here
        if(N < 2)
            return -1;
            
        long maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<N-1; i++){
            maxSum = Math.max(maxSum, arr[i]+arr[i+1]);
        }
        
        return maxSum;
    }
}
