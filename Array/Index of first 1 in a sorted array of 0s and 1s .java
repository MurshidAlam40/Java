import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a[] = new long[(int)(n)];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        
        Solution obj = new Solution();
        System.out.println(obj.firstIndex(a, n));
    }
}



class Solution {
    
    public long firstIndex(long arr[], long n){
        // Your code goes here
        
        int i = 0;
        
        while(i < n){
            if(arr[i] == 1){
                return i;
            }
            i++;
        }
        return -1;
    }
}
