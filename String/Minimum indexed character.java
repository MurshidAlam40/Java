import java.util.*;
import java.lang.*;
import java.io.*;



class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        int ans = -1;
        
        for(int i=0; i<str.length(); i++){
            char chr = str.charAt(i);
            
            if(patt.contains(Character.toString(chr))){
                ans = str.indexOf(chr);
                break;
            }
        }
        return ans;
    }
}



class Main {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    
	    String s1=sc.next();
	    String s2=sc.next();
	    
	    int res = new Solution().minIndexChar(s1, s2);
	    System.out.println(res);
	}
}
