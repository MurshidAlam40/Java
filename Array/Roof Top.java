import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
           
        int n = sc.nextInt();
        int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
          
        System.out.println(new Solution().maxStep(arr, n));
    }
}



class Solution
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int A[], int N)
    {
        // Your code here
        int count = 0;
        int max = 0;
        for(int i=0; i<N-1; i++){
            if(A[i] < A[i+1]){
                count++;
            }
            else{
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }
    
}
