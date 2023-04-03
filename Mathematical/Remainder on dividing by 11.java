//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
            String x = br.readLine(); 
            
            Solution ob = new Solution();
		
            System.out.println(ob.xmod11(x)); 
    } 
} 





class Solution 
{ 
    static int xmod11(String x)
	{    
	    // code here
        int curr = 0;
        int rem = 0;
        
        for(int i=0; i<x.length(); i++){
            curr = rem*10 + x.charAt(i)-'0';
            
            rem = curr%11;
        }
        return rem;
	}
} 

