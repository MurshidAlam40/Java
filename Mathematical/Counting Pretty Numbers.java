import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
	    int L = sc.nextInt();
        int R = sc.nextInt();
	    
	    System.out.println(PrettyNumbers(L, R));
	}
	
	static int PrettyNumbers(int L, int R){
	    
	    int count = 0;
	    
	    for(int i=L; i<=R; i++){
	        int lastDigit = i%10;
	        
	        if(lastDigit == 2 || lastDigit == 3 || lastDigit == 9)
	            count++;
	    }
	    return count;
	}
}
