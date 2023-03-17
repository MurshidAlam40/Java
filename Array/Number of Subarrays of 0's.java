import java.util.*;

public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int arr[] = new int[N];
        
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
		System.out.println(obj.no_of_subarrays(N, arr));
    }
}

class Solution{
	long no_of_subarrays(int N, int [] arr) {
		//Write your code here
		// Using Kadane’s Algorithm
		long ans = 0;
		long count = 0;
		
		for(int i=0; i<N; i++){
		    if(arr[i] == 0)
		        count++;
		    else{
		        ans += (count + 1)*count/2;
		        count = 0;
		    }
		}
		 ans += (count + 1)*count/2;
		return ans;
	}
}
