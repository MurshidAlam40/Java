import java.util.*;
import java.io.*;

class SearchingElement
{
    
    public static void main(String args[])throws IOException
    {
        Scanner read = new Scanner(System.in);
            
        int n = read.nextInt();
        int k = read.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = read.nextInt();
        }
        
        Solution obj = new Solution();
        
        System.out.println(obj.searchInSorted(arr, n, k));
    }
}


class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        //1- Using Linear Mthod
        for(int i=0; i<N; i++){
            if(arr[i] == K)
            return 1;
        }
        return -1;
        /* 
        for(int element : arr){
            if(element == K)
                return 1;
        }
        return -1;
        */
        /*
        //Using Binary Search
        Arrays.sort(arr);
        
        int res = Arrays.binarySearch(arr, K);
        //boolean test = res >= 0 ? 1 : -1;
        return 1;
        */
        /*
        //List.Contains() Method
        boolean test = Arrays.asList(arr).contains(K);
        return 1;
        */
        /*
        // Stream.anyMatch() Method
        boolean test = IntStream.of(arr).anyMatch(x -> x == K);
        return 1;
        */
    }
}
