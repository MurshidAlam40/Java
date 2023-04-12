import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        Solution ob = new Solution();
        System.out.println(ob.transform(str));

    }
}


class Solution{
    public String transform(String s){
        // code here
        char ch[] = s.toCharArray();
        //convert the first letter of word in the string to uppercase. 
        ch[0] = Character.toUpperCase(ch[0]);
        
        for(int i=1; i<ch.length-1; i++){
            //if white space are found than next letter should be UpperCase
            if(ch[i] == ' '){
                ch[i+1] = Character.toUpperCase(ch[i+1]);
            }
        }
        
        return new String(ch);
    }
}
