import java.util.*;
import java.lang.*;

class elements{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Solution soln = new Solution();
        int ans[] = soln.binaryArray(n, a);
        for(int x : ans){
            System.out.print(x +" ");
        }
        System.out.println();
    }
}


class Solution{
    public int[] binaryArray(int n, int arr[]){
        // Code Here.
        int ans[] = new int[n];
        int sum = 0;
        int k = 0;
        
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        
        for(int i=0; i<n; i++){
            sum = sum - arr[i];
            if(sum%2 == 0){
                ans[k] = 1;
                k++;
            }
            else{
                ans[k] = 0;
                k++;
            }
            sum += arr[i];
        }
        return ans;
    }
}
