//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
    public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			int [] A = new int[N];
			
			for(int i = 0; i < N; i++){
				A[i] = Integer.parseInt(str[i]);
			}
			
			Solution ob = new Solution();
			System.out.println(ob.equalSum(A, N));
    }
}


class Solution{
	int equalSum(int [] A, int N) {
		//Write your code here
		/*
		//Brute force
		for(int i=0; i<N; i++){
		    int Lsum = 0; int Rsum = 0;
		    
		    for(int j=0; j<i; j++){
		        Lsum += A[j];
		    }
		    
		    for(int k=i+1; k<N; k++){
		        Rsum += A[k];
		    }
		    
		    if(Lsum == Rsum)
		        return i+1;
		}
		return -1;
		*/
		
		int sum = 0;
		int Lsum = 0;
		
		for(int i=0; i<N; i++){
		    sum += A[i];
		}
		
		for(int i=0; i<N; i++){
		    sum -= A[i];
		    
		    if(sum == Lsum)
		        return i+1;
		        
		    else
		        Lsum += A[i];
		}
		
		return -1;
	}
}
