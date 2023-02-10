import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        Scanner sc = new Scanner(System.in);
       
        long n = sc.nextLong();
        long a[] = new long[(int)(n)];
        
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        
        Solution obj = new Solution();
        System.out.println(obj.printMinimumProduct(a, n));
	}
}


class Solution {
    
    public long printMinimumProduct(long arr[], long n)
    {
        Arrays.sort(arr);
        
        long prod = arr[0]*arr[1];
        
        
        return prod;
    }
}
