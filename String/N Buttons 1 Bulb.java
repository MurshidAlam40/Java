import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
		    int n = read.nextInt();
    		String s = read.next();
    		String r = read.next();
		// Update the code below to solve this problem
            int count = 0;
            
            for(int j=0; j<n; j++){
                if(s.charAt(j) != r.charAt(j)){
                    count++;
                }
            }
            if(count%2 == 0){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
		}
	}
}
