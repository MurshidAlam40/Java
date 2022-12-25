import java.util.Scanner;

class Main {
    public static int fibonacci(int n){
        
    //Write your code here to calculate
    //to calculate the nth fibonacci number
    
    int a = 0;
    int b = 1;
    int fib = 0;
    
    for(int i=2; i<=n; i++){
        fib = a + b;
        a = b;
        b = fib;
    }
    return fib; 
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = fibonacci(n);
        System.out.println(ans);
       
    }
}
