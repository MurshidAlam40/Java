import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] str = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        int ans = new Solution().findKRotation(a, n);
        System.out.println(ans);
    }
}

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        //minimum array declaration
        int min = arr[0];
        int minIndex = 0;
        
        for(int i=0; i<n; i++){
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
