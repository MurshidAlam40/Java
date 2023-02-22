import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking elements count
        int n = sc.nextInt();

        //creating an array of length n
        int arr[] = new int[n];

        //adding elements to the array
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        //creating an object of class Solutions
        Solution ob = new Solution();

        //calling the method findNumberOfTriangles()
        //of class Solutions and printing the results
        System.out.println(ob.findNumberOfTriangles(arr,n));
    }
}


class Solution
{
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
        /*
        int count = 0;
        Arrays.sort(arr);
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i] + arr[j] > arr[k])
                        count++;
                }
            }
        }
        return count;
        */
        int count = 0;
        Arrays.sort(arr);
 
        for (int i=n-1; i>=1; i--) {
            int start = 0;
            int end = i - 1;
            while (start < end) {
                if (arr[start] + arr[end] > arr[i]) {
                    count += end - start;
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return count;
    }
}
