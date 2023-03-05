import java.io.*;
import java.util.*;

class swapArray
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
       
            
        int n=sc.nextInt();
        int k=sc.nextInt();
	    int arr[] = new int[n];
	    
	    //adding elements
	    for(int i=0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    new Solution().swapKth(arr, n, k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

class Solution {
    void swapKth(int arr[], int n, int k) {
        // code here
        int temp = arr[k-1];
        
        arr[k-1] = arr[n-k];
        
        arr[n-k] = temp;
    }

}
