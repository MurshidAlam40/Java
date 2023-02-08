import java.util.*;
import java.io.*;

class RemoveElement
{
    // Function to remove the element
    public static int[] removeTheElement(int[] arr, int index){
        
        if (arr==null || index<0 || index >= arr.length){
            return arr;
        }
 
        // Create another array of size one less
        int[] newArr = new int[arr.length - 1];
 
        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {
            /*
            // if the index is the removal element index
            if (i == index) {
                continue;
            }
            */
            if(i != index){
                newArr[k] = arr[i];
                k++;
            }
            
            // if the index is not the removal element index
            //newArr[k++] = arr[i];
        }
        return newArr;
    }
    
    public static void main(String[] args){
 
        Scanner read = new Scanner(System.in);
            
        int n = read.nextInt();
        int index = read.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = read.nextInt();
        }
 
 
        arr = removeTheElement(arr, index);
 
        System.out.println("Resultant Array: "+ Arrays.toString(arr));
    }
}
