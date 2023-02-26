import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String args[]) {
        // taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        // taking total number of elements
        int n = sc.nextInt();
        
        // Declaring and Intializing an array of size n
        int arr[] = new int[n];

        // adding all the elements to the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = new Solution().findMaxSum(arr, n);
        System.out.println(ans);
    }
}
// } Driver Code Ends


class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        
        int sum = 0;
        int max = arr[0];
        
        for(int i=1; i<n; i++){
            int sum1 = arr[i] + sum;
            int sum2 = 0 + max;
            int currSum = Math.max(sum1, sum2);
            sum = max;
            max = currSum;
        }
        return max;
    }
}
