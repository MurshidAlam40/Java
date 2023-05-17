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
    		String s = read.next();
    		// Update the code below to solve this problem
            
            boolean flag = true;
            
            for(int j=1; j<s.length(); j += 2){
                if(s.charAt(j) == s.charAt(j-1)){
                    flag = false;
                    break;
                }
                else{
                    flag = true;
                }
            }
    		if(flag == true){
    		    System.out.println("yes");
    		}
    		else{
    		    System.out.println("no");
    		}
		}
	}
}
