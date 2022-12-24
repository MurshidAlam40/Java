import java.util.Scanner;

class Main {

public static int nFactorial(int n){
    int ans = 1;
    
    //Write your code here
    /*
    while(n > 0){
        ans = ans * n;
        n--;
    }
    */
    for(int i=1; i<=n; i++){
        ans = ans*i;
    }
    
    return ans;
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = nFactorial(n);
        System.out.println(ans);
    }
}
