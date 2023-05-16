import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution ob = new Solution();
        long ans = ob.nthStair(n);
        System.out.println(ans);     
    }
}

class Solution
{
    public long nthStair(int n)
    {
        // Code here
        /*
        int a = 1;
        int b = 1;
        int c = 0;
        for(int i=2; i<=n; i++){
            c = a+1;
            a = b;
            b = c;
        }
        return b;
        */
       
        //Method 2: (Use Dynamic Programming)
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-2] + 1;
        }
        return dp[n];
        
    }
}
