import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
	     //Taking input using Scanner class
    	 Scanner sc = new Scanner(System.in);
    	 
    	 //taking count of total testcases
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	   
    	   //taking the String
    	   String s=sc.next();
    	   
    	   Geeks obj=new Geeks();
    	   
    	   //calling follPatt() method
    	   //of class Geeks and passing
    	   //String as parameter
    	   obj.follPatt(s);
    	   
    	 }
    }
}
class Geeks{
    
    static void follPatt(String s)
    {
        
        //Your code here
        int count = 0;
        for(int i=0 ; i<s.length() ; ){
           while(i<s.length() && s.charAt(i) == 'x'){
               count++;
               i++;
           }
           while(i<s.length() && s.charAt(i) == 'y'){
               count--;
               i++;
           }
           if(count != 0){
               System.out.println("0");
               break;
           }
        }
        if(count == 0){
           System.out.println("1");
        }
    }
}
