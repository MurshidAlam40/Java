import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
    }
}
class Solution {
    int isPalindrome(String S) {
        // code here
        S = S.toLowerCase();
        
        int start = 0;
        int end = S.length()-1;
        int isPal = 1;
        
        while(start < end){
            if(S.charAt(start) != S.charAt(end)){
                isPal = 0;
                break;
            }
            start++;
            end--;
        }
        if(isPal == 1)
            return 1;
        else
            return 0;
    }
};
