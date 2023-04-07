import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
  
        String s = sc.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.sort(s));
    }
}

class Solution 
{ 
    String sort(String s) 
    {
        // code here
        char array[] = s.toCharArray();
        
        Arrays.sort(array);
        
        //return new String(array);
        //or
        String rev = String.valueOf(array);
        
        return rev;
    }
} 
