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
            int d = sc.nextInt();

            new Solution().leftRotate(arr, n, d);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
}
class Solution {
    void leftRotate(int[] arr, int n, int d) {
        // code here
        //declare temp [] with same size
        int temp[] = new int[n];
        // current index of temp []
        int k = 0;
        //store the element from d to n in temp []
        for(int i=d; i<n; i++){
            temp[k] = arr[i];
            k++;
        }
        //store the element from 0 to d in temp []
        for(int i=0; i<d; i++){
            temp[k] = arr[i];
            k++;
        }
        // Copying the elements of temp[] in arr[] to get the final rotated array
        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
    }
}
