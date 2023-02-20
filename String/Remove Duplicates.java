import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Solution ob = new Solution();
        String result = ob.removeDups(s);
        
        System.out.println(result);
    }
}



class Solution {
    String removeDups(String S) {
        // code here
        
        String ans ="";
        
        for(int i = 0 ;i < S.length() ;i++){
            String str = String.valueOf(S.charAt(i));
            if(!ans.contains(str)){
                ans +=S.charAt(i);
            }
        }
        return ans;
    }
}
