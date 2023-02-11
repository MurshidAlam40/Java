import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner read = new Scanner(System.in);
        
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        }
    }
}

class Solution 
{ 
    String firstRepChar(String s){ 
        // code here
        char arr[] = new char[26];
        for(char ch : s.toCharArray()){
            if(arr[ch - 'a'] > 0)  
                 return String.valueOf(ch);   
            arr[ch - 'a']++;
        }
        return "-1";
    }
} 
