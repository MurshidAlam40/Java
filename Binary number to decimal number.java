import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	String str = br.readLine().trim();
      	Solution ob = new Solution();
      	int ans = ob.binary_to_decimal(str);
      	System.out.println(ans);
    }
}

class Solution {
    public int binary_to_decimal(String str) {
        // Code here
        int m = 0;
        int k = 1;//base
        
        for(int i=str.length()-1; i>=0; i--){
            m += (str.charAt(i) - '0')*k;
            k = k*2;
        }
        return m;
    }
}