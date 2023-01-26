import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int arr [] = new int[N];
	    for(int i = 0;i<N;i++){
            arr[i] = sc.nextInt();    
        }
	    
	    Complete obj = new Complete();
	    int ans = obj.multiply(arr, N);
    	System.out.println(ans);
	}
}


class Complete{
    // Function for finding maximum and value pair
    public static int multiply (int arr[], int n) {
        //Complete the function
        int sum1 = 0;
        
        int sum2 = 0;
        
        for(int i=0; i<n/2; i++){
            sum1 += arr[i];
        }
        
        for(int i=n/2; i<n; i++){
            sum2 += arr[i];
        }
        int mult = sum1*sum2;
        
        return mult;
    }
}
