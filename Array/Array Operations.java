import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Solution obj = new Solution();
        int res = obj.arrayOperations(n, arr);
        
        System.out.println(res);
    } 
} 
   
class Solution {
    public static int arrayOperations(int n, int[] arr) {
        // code here
        int ans = 0;
        int len = 0;
        
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                if(len != 0){
                    ans++;
                    len = 0;
                }
            }
            else{
                len++;
            }
        }
        
        if(len == n){
            return -1;
        }
        
        if(len != 0){
            ans++;
        }
        return ans;
    }
}
