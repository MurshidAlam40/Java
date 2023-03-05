import java.io.*;
import java.util.*;

class NiceSubarray
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
       
            
        int n=sc.nextInt();
	    int a[] = new int[n];
	    
	    //adding elements
	    for(int i=0; i<n; i++){
	        a[i] = sc.nextInt();
	    }
	    
	    Solution obj = new Solution();
	    
	    //calling maxSubarraySum() function
	    System.out.println(new Solution().niceSubarray(a, n));
    }
}

class Solution{
    public int niceSubarray(int a[], int n){
        // Code Here.
        int max = 0;
        for(int i=0; i<n; i++){
            int count = i;
            
            while(count < n && a[count] == count-i+1) {
                count++;
            }
            max = Math.max(max, count-i);
        }
        return max;
    }
}
