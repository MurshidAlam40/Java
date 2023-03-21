import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    
		    int nums[]=new int[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        nums[i]=sc.nextInt();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.zeroFilledSubarray(nums, n));
		
	}
}


class Solution {
    public long zeroFilledSubarray(int[] nums, int n) {
        //int n = nums.length;
        long count = 0;
        long ans = 0;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                count++;
                ans += count;
            }
            else{
                count=0;
            }
        }
        return ans;
    }
}
