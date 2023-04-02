import java.util.*;
import java.io.*;

class maximum_Sum{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(new Solution().maximumSum(arr, n));
    }
}
 
class Solution{
    public long maximumSum(int A[], int n){
        // Code Here.
        Arrays.sort(A);
        long ans = 0;
        
        for(int i=0; i<n; i++){
            ans += (long)A[i]*(i+1);
        }
        return ans;
    }
}
