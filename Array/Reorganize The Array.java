import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		Scanner sc = new Scanner(System.in);
		
	
	    int n = sc.nextInt();
	    int arr [] = new int[n];
	    for(int i = 0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    Complete obj = new Complete();
	    arr = obj.Rearrange(arr, n);
	    for(int i=0; i<n; i++){
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	}
}

            

class Complete{
    
    // Function for finding maximum and value pair
    public static int[] Rearrange (int arr[], int n) {
        // Complete the function
        /*
        Set<Integer> s = new HashSet<Integer>();
 
        // Storing all the values in the HashSet
        for(int i=0; i<n; i++){
           s.add(arr[i]);
        }
 
        for(int i=0; i<n; i++){
            if(s.contains(i))
                arr[i] = i;
            else
                arr[i] = -1;
        }
        return arr;
        */
        
        //Swap elements in Array
        //Iterate through elements in an array 
        for(int i=0; i<n; ) {
            //If arr[i] >= 0 && arr[i] != i, put arr[i] at i 
            //( swap arr[i] with arr[arr[i]])
            if(arr[i] != i && arr[i] != -1) {
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}
