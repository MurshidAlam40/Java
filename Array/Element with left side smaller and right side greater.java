import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        
        Compute obj = new Compute();
        System.out.println(obj.findElement(a, n));
            
    }
}


class Compute {
    public int findElement(int arr[], int n){
        
       
        int[] left = new int[n];
        int leftMin = Integer.MIN_VALUE;
       
        for(int i=0; i<n; i++){
            leftMin = Math.max(leftMin, arr[i]);
            left[i] = leftMin;
        }
        
        int[] right = new int[n];
        int rightMax = Integer.MAX_VALUE;
        for(int i=n-1; i>=0; i--){
            rightMax = Math.min(rightMax, arr[i]);
            right[i] = rightMax;
        }
        
        for(int i=1; i<n-1; i++){
            if(arr[i] >= left[i] && arr[i] <= right[i])
                return arr[i];
        }
        return -1;
    }
}
