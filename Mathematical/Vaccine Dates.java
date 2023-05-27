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
	        int d = sc.nextInt();
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    if(d >= l && d <= r){
		        System.out.println("Take second dose now");
		    }
		    else if(d >= l && d >= r){
		        System.out.println("Too Late");
		    }
		    else{
		        System.out.println("Too Early");
		    }
		}
	}
}
