import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        obj.swapElements(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Solution
{
    public void swapElements(int[] arr, int n)
    {
        // Code here
        int temp = 0; //create an empty temp variable
        
        for(int i=0; i<n-2; i++){
            //swap the element
            temp = arr[i+2];
            arr[i+2] = arr[i];
            arr[i] = temp;
        }
    }
}
