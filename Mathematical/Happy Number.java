import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner read = new Scanner(System.in);
        
            int N = read.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.isHappy(N));
    }
}


class Solution { 
  
     static int isHappy(int n) { 
         //code here
        int sum = 0;
        
        while(n > 0){
            int digit = n%10;
            sum += (digit*digit);
            n = n/10;
        }
        
        if(sum == 1)
            return 1;
        if(sum < 10)
            return 0;
        return isHappy(sum);
     }
}
