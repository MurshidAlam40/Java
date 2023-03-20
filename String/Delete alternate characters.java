import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next ();
        Solution ob = new Solution();

        System.out.println(ob.delAlternate(S));
        
    }
}


class Solution {
    static String delAlternate(String S) {
        // code here
        String ans = "";
        
        for(int i=0; i<S.length(); i++){
            if(i%2 == 0){
                ans += S.charAt(i);
            }
        }
        return ans;
    }
}
