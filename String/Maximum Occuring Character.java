//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class Main{
	public static void main (String[] args) throws IOException{
	 Scanner sc = new Scanner(System.in);
	 
	     String line=sc.readLine();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	 }
}

class Solution{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line){
        // Your code here
        int max = -1;
        int[] count = new int[256];
        
        for(int i=0;i<line.length();i++){
            count[line.charAt(i)]++;
            max = Math.max(max,count[line.charAt(i)]);
        }
        
        
        char ans = ' ';
        for(int i=0;i<256;i++){
            if(count[i] == max){
                ans = (char)i;
                break;
            }
        }
        
        return ans;
    }
}
