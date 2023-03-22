import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(read.readLine());
        Solution ob = new Solution();
        System.out.println(ob.isPallindrome(N));
    }
}


class Solution{
    static long isPallindrome(long N){
        // code here
        
        //This parameter specifies the number to be converted to binary string. 
        String binary = Long.toBinaryString(N);
        
        int n = binary.length();
        //Check Palindrome numbers
        for(int i=0; i<n; i++){
            if(binary.charAt(i) != binary.charAt(n-i-1)){
                return 0;
            }
        }
        return 1; 
    }
}
