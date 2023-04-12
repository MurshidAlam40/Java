import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0){
		    BigInteger n = sc.nextBigInteger();
		   
    	    BigInteger officer = BigInteger.valueOf(20);
    	    BigInteger remApplication = n.mod(officer);
    	    
    	    System.out.println(remApplication);
		}
	}
}
