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

        int ans = new Solution().countZeroes(arr, n);
        System.out.println(ans);
    }
}


class Solution {
    int countZeroes(int[] arr, int n) {
        // code here
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 0)
                count++;
        }
        return count;
    }

}
