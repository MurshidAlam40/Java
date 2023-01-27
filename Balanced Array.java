import java.io.*;
import java.util.*;

class Solution
{
    long minValueToBalance(long a[] ,int n)
    {
        int ans = 0;
        int sum1 = 0;
        for(int i=0; i<n/2; i++){
            sum1 += a[i];
        }
        int sum2 = 0;
        for(int i=n/2; i<n; i++){
            sum2 += a[i];
        }
        if(sum1 > sum2){
            ans = sum1 - sum2;
        }
        else{
            ans = sum2 - sum1;
        }
        
        return ans;
    }
}

class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        
        long a[]=new long[n];
        for(int  i=0;i<n;i++)
        {
            a[i]=sc.nextLong();
        }
        Solution ob=new Solution();
        
        long ans=ob.minValueToBalance(a,n);
        System.out.println(ans);
    }
}
