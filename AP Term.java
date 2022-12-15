import java.util.Scanner;

class Main {

public static void utility(int a, int d, int n){
    //Complete the code above
    int ans = a + (n - 1)*d;
    
    System.out.println(ans);
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
      
        int a = scn.nextInt();
        int d = scn.nextInt();
        int n = scn.nextInt();
        utility(a, d, n);
    }
}
// } Driver Code Ends
