/* package codechef; // don't place package name! */

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
		int T = sc.nextInt();
		
		while(T-->0){
		    int n = sc.nextInt();
		    System.out.println(countExactly50(n));
		}
	}
	
	static int countExactly50(int n){
	    
	    int count = 0;
	    
	    while(n != 50){
            if(n < 50){
                n += 2;
            } 
            else{
                n -= 3;
            }
            count++;
        }
        return count;
	}
}
