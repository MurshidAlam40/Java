import java.io.*;
import java.util.*;

class swapArray
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
       
            
        long n = sc.nextLong();
        long a[] = new long[(int)(n)];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long k = sc.nextLong();
        
        Compute obj = new Compute();
        System.out.println(obj.maxSumWithK(a, n, k));
    }
}
class Compute {
    
    public long maxSumWithK(long a[], long n, long k)
    {
        int[] maxSum = new int[a.length];
        int sum = 0;
        for(int i=0; i<a.length; i++) {
            
            sum += a[i];
            maxSum[i] = sum;
            if (sum < 0)
                sum = 0;
        }
        
        long curr_max = 0;
        long ans = Long.MIN_VALUE;
        
        for(int i = 0; i < k; i++) {
            curr_max += a[i];
        }
        
        if(curr_max > ans)
            ans = curr_max;
        
        for(int i=(int) k; i<a.length; i++) {
            curr_max += a[i] - a[i - (int) k];
            long currSum = curr_max + maxSum[i - (int) k];
            if(curr_max > ans)
            ans = curr_max;
            
            if (currSum > ans)
                ans = currSum;
        }
        return ans;
    }
}
