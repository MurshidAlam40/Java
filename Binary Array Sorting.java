import java.util.*;
import java.io.*;

class Sorting
{
    public static void main(String args[])throws IOException
    {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        
        //reading input using BufferedReader class
        Scanner sc = new Scanner(System.in);
        
        //reading size of array 
        int N =sc.nextInt();
        
        //creating a new array of size n
        int A[] = new int[N];
        
        //adding elements to the array
        for(int i = 0; i < N; i++)
            A[i] = sc.nextInt();
            
        //calling the method binSort() of
        //class BinarySort()
        new Solution().binSort(A, N);
        
        //printing the elements of array
        for(Integer x: A)
            System.out.print(x + " ");
        System.out.println();
    }
}

class Solution
{
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
        // add your code here
        //Method-1
        /*
        Arrays.sort(A);
        */
        //Second Method
        if (N == 0)
            return;
        int count = 0;
        for (int i=0; i<N; i++) {
            if (A[i] == 0)
                count++;
        }
        for (int i=0; i<count; i++) {
            A[i] = 0;
        }
        for (int i=count; i<N; i++) {
            A[i] = 1;
        }

        /**************
        * No need to print the array
        * ************/
    }
}
