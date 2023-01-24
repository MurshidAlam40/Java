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
        
        //picking the starting point
        for(int i=0; i<n; i++){
            //picking the ending point
            for(int j=i; j<n; j++){
                // Print subarray between current starting and ending points
                for(int k=i; k<=j; k++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
        
    }
}
