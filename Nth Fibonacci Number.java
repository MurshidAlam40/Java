import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
    BufferedReader read =
        new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(read.readLine());
        Solution ob = new Solution();

        System.out.println(ob.nthFibonacci(n));
    }
}

class Solution {
    static long nthFibonacci(long n){
        // code here
        /*
        if(n <= 1)
            return n;
        return nthFibonacci(n-1) + nthFibonacci(n-2);
        
        */
        
        long mod = 1000000007;
        long a = 0;
        long b = 1;
        long c;
        if (n == 0 || n == 1)
            return n;
        for (int i=2; i<=n; i++){
            c = (a + b) % mod;
            a = b;
            b = c;
        }
        return b % mod;
    }
}
