import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next ();
        Solution ob = new Solution();
        String ans = ob.modify(s);
        System.out.println(ans);
        
    }
}


class Solution{
    String modify(String s){
        
        if(s.charAt(0) >= 65 && s.charAt(0) <= 90){
            s = s.toUpperCase();
        }
        else{
            s = s.toLowerCase();
        }
        return s;
    }
}
