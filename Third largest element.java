import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		Solution g = new Solution();
		System.out.println(g.thirdLargest(arr,n));
	}
}

class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    
	    /*
	    Arrays.sort(a);
	    return a[n-3];
	    */
	    
	    
	    /* There should be atleast three elements */
        if (n < 3){
            return -1;
        }
     
        // Find first largest element
        int first = a[0];
        for (int i = 1; i < n ; i++){
            if (a[i] > first){
                first = a[i];
            }
        }
        // Find second largest element
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++){
            if (a[i] > second && a[i] < first){
                second = a[i];
            }
        }
        // Find third largest element
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++){
            if (a[i] > third && a[i] < second){
                third = a[i];
            }
        }
        return third;
    }
}
