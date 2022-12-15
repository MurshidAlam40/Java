//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

public static void utility(int n){

    
    int y = Math.abs(n);
    int ans = y % 10;

   
    System.out.println(ans);
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
      
        int n = scn.nextInt();
        utility(n);
    }
}
// } Driver Code Ends
