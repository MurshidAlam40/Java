import java.io.*;
import java.util.*;

// Driver class
class Main {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		Scanner sc = new Scanner(System.in);
		    int sizeOfArray = sc.nextInt();
		    int arr [] = new int[sizeOfArray];
		    
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] =  sc.nextInt();
		    }
		    
		    int sizeOfArray_M = sc.nextInt();
		    int brr [] = new int[sizeOfArray_M];
		    
		    for(int i = 0;i<sizeOfArray_M;i++){
		        brr[i] =  sc.nextInt();
		    }
		    
		    
		    Solution obj = new Solution();
		    long res = obj.find_multiplication(arr, brr, sizeOfArray, sizeOfArray_M);
		    System.out.println(res);
	}
}


class Solution{
    
    // Function for finding maximum and value pair
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        // Complete the Function
        
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int min = brr[0];
        
        for(int i=0; i<m; i++){
            if(brr[i]<min){
                min = brr[i];
            }
        }
        int prod = max*min;
        
        return prod;
    }
}
