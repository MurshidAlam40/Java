import java.io.*;
import java.util.*;
class GfG{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        Solution ob = new Solution();
        System.out.println(ob.removeConsonants(s));
        }
}    

class Solution
{
    public String removeConsonants(String s)
    {
        //code here.
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                
                sb.append(ch);
            }
        }
        if(sb.length() == 0){
           return "No Vowel";
        }
        return sb.toString();
    }
}
