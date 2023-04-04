import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       
        int l = sc.nextInt();
        int r = sc.nextInt();
        
        new Solution().reverseSubArray(arr, n, l, r);
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}



class Solution {
    void reverseSubArray(int arr[], int n, int l, int r) {
        // code here
        int start = l-1;
        int end = r-1;
        
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
}
