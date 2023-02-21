import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        System.out.println(obj.reverse(sc.next()));
    }
}



class Solution {
    
    public String reverse(String S){
        //code here
        String str = "";
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<S.length(); i++){
            st.push(S.charAt(i));
        }
        while(!st.empty()){
            str += st.peek();
            st.pop();
        }
        return str;
    }

}
