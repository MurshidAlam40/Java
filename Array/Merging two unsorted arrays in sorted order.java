import java.io.*;
import java.util.*;

class Solution{
    void sortedMerge(long A[], long B[], long res[], int N,int M){
        // Your code goes here
        // resultant array size
        int k = N+M;
        // Creating a new array
        long newArray[] = new long[k];
        //Loop to store the elements of first
        // array into resultant array
        for(int i=0; i<N; i++){
            newArray[i] = A[i];
        }
        // Loop to concat the elements of second 
        // array into resultant array
        for(int i=0; i<M; i++){
            newArray[N+i] = B[i];
        }
        //sort the array
        Arrays.sort(newArray);
        // Loop to store element in res[] array after merging
        for(int i=0; i<M+N; i++){
            res[i] = newArray[i];
        }
    }
}

class Array {

    // Driver code
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();



        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long b[] = new long[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
        }
        long res[] = new long[500001];
        Solution ob = new Solution();
        ob.sortedMerge(a,b,res,n,m);
        for (int i = 0; i < n+m; i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
