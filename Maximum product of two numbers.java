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

        int ans = new Solution().maxProduct(arr, n);
            System.out.println(ans);
    }
}


class Solution {
    int maxProduct(int arr[], int n) {
        // code here
        
        Arrays.sort(arr);

        int product = 0;

        return product=arr[n-1]*arr[n-2];
    }
}
