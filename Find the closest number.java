import java.io.*;
import java.util.*;


class Main {
	public static void main (String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int target = sc.nextInt();
	    
	    int arr[] = new int[n];
	    
	    for(int index = 0;index < n; index++){
	        arr[index] = sc.nextInt();
	    }
	    
	    Solution obj = new Solution();
	    
	    System.out.println(obj.findClosest(arr, n, target));
}
}


class Solution{
    
    public static int findClosest(int arr[], int n, int target) 
    { 
        // Complete the function
        // Corner cases
        if (target <= arr[0])
            return arr[0];
        if (target >= arr[n - 1])
            return arr[n - 1];
 
        // Doing binary search
        int i = 0;
        int j = n;
        int mid = 0;
        while (i < j) {
            mid = (i + j) / 2;
 
            if (arr[mid] == target)
                return arr[mid];
                
            if (target < arr[mid]) {
                if (mid > 0 && target > arr[mid - 1])
                    return getClosest(arr[mid - 1], arr[mid], target);
                j = mid;             
            }
            else {
                if (mid < n-1 && target < arr[mid + 1])
                    return getClosest(arr[mid], arr[mid + 1], target);               
                i = mid + 1; 
            }
        }
        return arr[mid];
    }
    public static int getClosest(int val1, int val2, int target)
    {
        if (target - val1 >= val2 - target)
            return val2;       
        else
            return val1;       
    }
}
