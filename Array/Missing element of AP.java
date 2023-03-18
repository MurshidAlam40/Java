//{ Driver Code Starts
//Initial Template for Java




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
           
        int n = sc.nextInt();
        int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = new Solution().findMissing(arr, n);
        System.out.println(ans);
    }
}



class Solution {
    int findMissing(int[] arr, int n) {
        // code here
        int a, l, s;
        int sum = 0, missingnumber;
        a = arr[0];
        l = arr[n - 1];
  
        if((a+l) % 2 == 0){
            s = (a+l) / 2;
            s = s * (n+1);
        }
        else{
            s = (n+1) / 2;
            s = (a+l) * s;
        }
  
        
        for (int i=0; i<=n-1; i++) {
            sum = sum + arr[i];
        }
  
        missingnumber = s - sum;
  
        return missingnumber;
    }
}
