import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Solution obj = new Solution();
        int res = obj.dominantPairs(n, arr);
        
        System.out.println(res);
	
	}
}

class Solution {
    public static int dominantPairs(int n, int[] arr) {
        // code here
         //sort left half
        Arrays.sort(arr, 0, n/2);
        //sort right half
        Arrays.sort(arr, n/2, n); 

        int ans = 0;
        int j = n/2;
        for(int i=0; i<n/2; i++){
             while(j < n && arr[i] >= 5*arr[j])
                j++;

            ans += j-n/2;
        }
        return ans;
    }
}
        
