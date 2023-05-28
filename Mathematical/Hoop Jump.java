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
		    
		    if(n == 1){
		        System.out.println(1);
		    }
		    else if(n%2 == 0){
		        System.out.println((n/2)+1);
		    }
		    else{
		        System.out.println((n+1)/2);
		    }
		}
	}
}
