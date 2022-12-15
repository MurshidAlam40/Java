import java.util.Scanner;

class Main {

public static void utility(int d, int n){
    //write your code here
    int x = n % 7;
    int ans = d - x;
    
    if(ans >= 0){
        System.out.print(ans);
    }
    else{
        System.out.print(ans + 7);
    }
    
    
    
}

//{ Driver Code 

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
     
        int d = scn.nextInt();
        int n = scn.nextInt();
        utility(d, n);
        System.out.println();
   
    }
}
