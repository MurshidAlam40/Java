import java.util.*;

public class Main{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = new Solution().getSingle(arr, n);
        System.out.println(ans);
    }
}

class Solution {
    int getSingle(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int count = 1;
        int ans = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] == ans){
                count++;
            }
            else{
                if(count%2 == 0){
                    ans = arr[i];
                    count = 1;
                }
                else{
                    return ans;
                }
            }
        }
        
        if(count%2 == 0){
            return 0;
        }
        return ans;
        //Using Bit oerator
        /*
        int count = 0;
        
        for(int i=0; i<n; i++){
            count = count ^ arr[i];
        }
        
        return count;
        */
    }
}
