import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
    public static void main (String[] args) 
    {
        long  x = 29;
    
        String bin = "";
        
        while (x != 0) 
        {
            bin += (char)((x & 1) + '0');
            x >>= 1;
        }
        StringBuffer ans = new StringBuffer(bin);
        ans = ans.reverse();
        System.out.println(ans);
        
    }
}
/*
Output:
11101
*/
