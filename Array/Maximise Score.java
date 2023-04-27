import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    System.out.println(maximiseScore(arr, n));
		}
	}
	public static int maximiseScore(int arr[], int n){
	    
	    int ans = Math.abs(arr[1]-arr[0]);
	    int ans2 = Math.abs(arr[n-1]-arr[n-2]);
	    int min = Math.min(ans, ans2);
	    
		    for(int i=1; i<n-1; i++){
		        int score = Math.max(Math.abs(arr[i] - arr[i-1]), Math.abs(arr[i+1] - arr[i]));
		        min = Math.min(score,min);
		    }
		    return min;
	}
}
