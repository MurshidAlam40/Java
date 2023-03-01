import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        
        Solution ob = new Solution();
        String ans = ob.removeConsecutiveCharacter(S);
        
        System.out.println(ans);
    }
}


class Solution{
    public String removeConsecutiveCharacter(String S){
        /*
        // Initialize an empty string for str
        String str = "";
        // Append the first string
        str = str + S.charAt(0);
        // Iterate stringfrom 1 to n-1
        for(int i=1; i<S.length(); i++){
         // If both elements are not same then append in str
            if(S.charAt(i) != S.charAt(i-1))
                str += S.charAt(i);
        }
        return str;
        */
        //2nd Method
        // Initialize an empty string for str
        String str = "";
        int i = 0;
        int j = 0;
        // Iterate string using j pointer
        while(j < S.length()){
            // If both elements are same then skip
            if(S.charAt(i) == S.charAt(j)){
                j++;
            }
             // If both elements are not same then append in str
            else if(S.charAt(j) != S.charAt(i) ){
                str += S.charAt(i);
                 // After appending, slide over the window
                i = j;
                j++;
            }
        }
        // Append the last string
        str = str + S.charAt(S.length()-1);
        
        return str;
    }
}
