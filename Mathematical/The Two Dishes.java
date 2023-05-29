import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0){
		    int n = sc.nextInt();
		    int s = sc.nextInt();
		    
		    if(s <= n){
		        System.out.println(s);
		    }
		    else if(s > n){
		        System.out.println(n-(s-n));
		    }
		}
	}
}
