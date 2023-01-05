import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
	     //taking input using Scanner class
    	 Scanner sc = new Scanner(System.in);
    	 
    	 boolean flag = false;

       //taking the 2 strings
       String s1=sc.next();
       String s2=sc.next();

       //creating an object of class Geeks
       Geeks obj=new Geeks();
       System.out.println(obj.coutChars(s1,s2));
    }
}
class Geeks{
    
    static int coutChars(String s1, String s2)
    {
        
       //Your code here
       int arr[] = new int[26];
       int arr1[] = new int[26];
       
       for(int i=0; i<s1.length(); i++){
           arr[s1.charAt(i) - 'a']++;
       }
       for(int i=0; i<s2.length(); i++){
           arr1[s2.charAt(i) - 'a']++;
       }
       int count = 0;
       for(int i=0; i<26; i++){
           count += Math.abs(arr[i] - arr1[i]);
       }
       return count;
    }
}
