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

        new Solution().pushZerosToEnd(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here\
        int index = 0;
        
        for(int i=1; i<n; i++){
            if(arr[index] != 0){
                index++;
            }
            if(arr[i] != 0 && arr[index] == 0){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
