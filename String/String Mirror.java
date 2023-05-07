import java.util.*;
import java.lang.*;

class elements{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        Solution obj = new Solution();
        String res = obj.stringMirror(str);
        
        System.out.println(res);
    }
}


class Solution {
    public static String stringMirror(String str) {
        // code here
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) < str.charAt(i-1) || (i>1 && str.charAt(i) == str.charAt(i-1))){
                sb.append(str.charAt(i));
            }
            else
                break;
        }
        
        String curr = sb.toString();
        String ans = curr + sb.reverse().toString();
        
        return ans;
    }
}
        
