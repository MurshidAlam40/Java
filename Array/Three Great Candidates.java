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


        long ans = new Solution().maxProduct(arr, n);
        System.out.println(ans);
    }
}



class Solution {
    long maxProduct(int[] arr, int n) {
        // code here
        /*
        int maxProd = Integer.MIN_VALUE;
        
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    maxProd = Math.max(maxProd, arr[i]*arr[j]*arr[k]);
                }
            }
        }
        return maxProd;
        */
        Arrays.sort(arr);
        long max = (long)arr[n-1]*arr[n-2]*arr[n-3];
        long min = (long)arr[0]*arr[1]*arr[n-1];
        long maxProd = (long)Math.max(max, min);
        return maxProd;
        
    }
}
