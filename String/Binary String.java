import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static Scanner sc = new Scanner(System.in);
	public static void main (String[] args){
        
	    int n=sc.nextInt();
	    sc.nextLine();
	    String s = new String();
	    s=sc.nextLine();
	    Solution obj = new Solution();
	    System.out.println(obj.binarySubstring(n, s));
	}
}


class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        /*
        int count = 0;
        // Pick a starting point
        for(int i=0; i<a; i++){
            if(str.charAt(i) == '1'){
                // Search for all possible ending point
                for(int j=i+1; j<a; j++){
                    if(str.charAt(j) == '1')
                        count++;
                }
            }
        }
        return count;
        */
        //2nd method
        /*
        int count = 0;
        // Traverse input string and count of 1's in it
        for(int i=0; i<a; i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        //We know that if count of 1’s is m, then there will be m * (m – 1) / 2 possible subStrings
        int subString = count*(count-1)/2;
        
        return subString;
        */
        //3rd method
        
        int count = 0;
        int subString = 0;
        
        for(int i=0; i<a; i++){
            if(str.charAt(i) == '1'){
                count++;
            
                if(count > 1){
                    subString += count-1;
                }
            }
        }
        return subString;
    }
}
