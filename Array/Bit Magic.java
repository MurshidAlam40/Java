import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Solution obj = new Solution();
        int res = obj.bitMagic(n, arr);
        
        System.out.println(res);
    }
}


class Solution {
    public static int bitMagic(int n, int[] arr) {
        // code here
        int ans = 0;
        int i = 0;
        int j = n-1;
        
        while(i < j){
            if(arr[i] != arr[j]){
                ans++;
            }
            i++;
            j--;
        }
        if(ans%2 == 0){
            return ans/2;
        }
        return ans/2+1;
    }
}
        
