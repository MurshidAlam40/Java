import java.io.*;
import java.util.*;

class MaxSumSubarray
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
       
            
        int n=sc.nextInt();
	    int arr[] = new int[n];
	    
	    //adding elements
	    for(int i=0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    Solution obj = new Solution();
	    
	    //calling maxSubarraySum() function
	    System.out.println(obj.maxSubarraySum(arr, n));
    }
}


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        /*
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            int currSum = 0;
            for(int j=i; j<n; j++){
                currSum += arr[j];
                
                //if(currSum > maxSum){
                  //  maxSum = currSum;
                //}
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
        */
        
        //Using Kadane’s algorithm
        
        
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        for(int i=0; i<n; i++){
            currSum += arr[i];
            
            if(currSum > maxSum){
                maxSum = currSum;
            }
            
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
        
    }
}
