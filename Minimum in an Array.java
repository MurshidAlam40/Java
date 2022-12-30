// Java Program to find minimum in arr[] 
class Test 
{ 
	
	// Method to find minimum in arr[] 
	static int minimum(int []arr) 
	{ 
		int i; 
		
		// Initialize minimum element 
		int min = arr[arr.length-1];
		//int min = Integer.MAX_VALUE;
		
		// Traverse array elements from second and 
		// compare every element with current max 
		for (i = 0; i < arr.length; i++) 
			if (arr[i] < min) 
				min = arr[i]; 
		
		return min; 
	} 
	
	public static void main(String[] args) 
	{ 
	    int arr[] = {10, 324, 45, 90, 9808}; 
		System.out.println("minimum in given array is " + minimum(arr)); 
		} 
} 
