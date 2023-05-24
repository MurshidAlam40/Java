import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        
 	    Solution ob = new Solution();
	    System.out.println(ob.getMaximum(N, arr));
    }
}

class Solution {
    public static int getMaximum(int N, int[] arr) {
        // code here
        long sum = 0;
        
        for(int i=0; i<N; i++){
            sum += arr[i];
        }
        
        for(int i=N; i>=0; i--){
            if(sum%i == 0){
                return i;
            }
        }
        return -1;
    }
}
