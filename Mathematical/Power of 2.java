import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        //input a number n
        long n = sc.nextLong();
        
        
        // if n is less than equal to zero then 
        //it can't be a power of 2 so we print No
        if(new Solution().isPowerofTwo(n) == true)
          System.out.println("YES");
        else System.out.println("NO");
    }
}

class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        if(n == 0)
            return false;
        
        while(n != 1){
            if(n%2 != 0)
                return false;
                
            n = n/2;
        }
        return true;
    }
}
