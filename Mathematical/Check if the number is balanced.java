import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
     
        String N = sc.next ();

        if (new Sol().balancedNumber (N))
		    System.out.println (1);
		else
		    System.out.println (0);
    }
}


class Sol
{
    Boolean balancedNumber(String N)
    {
        // your code here 
        int low = 0;
        int high = N.length()-1;
        int mid = low + (high - low)/2;
        int LHS = 0; int RHS = 0;
        
        for(int i=0; i<mid; i++){
            LHS += N.charAt(i) - '0';
        }
        
        for(int i=high; i>mid; i--){
            RHS += N.charAt(i)- '0';
        }
        
        if(LHS == RHS){
            return true;
        }
        return false;
    }
}
