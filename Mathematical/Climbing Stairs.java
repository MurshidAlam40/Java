import java.util.*;
import java.lang.*;

class elements{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.climbStairs(n));
    }
}


class Solution {
    public int climbStairs(int n) {
        /*
        if(n < 4){
            return n;
        }
        int a = 2;
        int b = 3;
        int c = 0;
        while(n>3){
            c = a+b;
            a = b;
            b = c;

            n--;
        }
        return c;
        */
        if(n <= 2){
            return n;
        }

        int arr[] = new int[n];
        arr[0] = 1;
        arr[1] = 2;

        for(int i=2; i<n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n-1];
    }
}
