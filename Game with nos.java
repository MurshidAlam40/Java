import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		Scanner sc = new Scanner(System.in);
		
		    int sizeOfArray = sc.nextInt();
		    int arr [] = new int[sizeOfArray];
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    Complete obj = new Complete();
		    arr = obj.game_with_number(arr, sizeOfArray);
		    for(int i=0; i< sizeOfArray;i++){
		        System.out.print(arr[i] + " ");
		    }
		    System.out.println();
	}
}

class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        for(int i=0; i<n-1; i++){
            arr[i] = arr[i] ^ arr[i+1];
        }
        return arr;
    }
}



