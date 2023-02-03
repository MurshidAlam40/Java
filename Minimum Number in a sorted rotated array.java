import java.io.*;
import java.lang.*;
import java.util.*;

class Array
{
    public static void main(String args[])throws IOException
    {
        Scanner read = new Scanner(System.in);
            int n = read.nextInt();
            
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
              arr[i] = read.nextInt();
              
            System.out.println(new Solution().minNumber(arr,0,n-1));
    }
    
}

class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        // Your code here
        /*
        //method -1
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
        */
        // Method 2
        //using Binary Search: 
        
        if (high < low)
            return arr[0];
 
       
        if (high == low)
            return arr[low];
        int mid
            = low + (high - low) / 2;
 
        if (mid < high && arr[mid + 1] < arr[mid])
            return arr[mid + 1];
 
        if (mid > low && arr[mid] < arr[mid - 1])
            return arr[mid];
 
       
        if (arr[high] > arr[mid]){
            return minNumber(arr, low, mid - 1);
        }
        return minNumber(arr, mid + 1, high);
    }
}
