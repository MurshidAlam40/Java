import java.io.*;
import java.util.*;
 
class InsertElement {
 
    // Function to insert x in arr at position pos
    public static int[] insertX(int n, int arr[], int x, int pos){
        // create a new array of size n+1
        int newarr[] = new int[n + 1];
        
         // the old array into the new array
        for (int i=0; i<n+1; i++) {
            // insert all elements till pos
            if (i < pos-1)
                newarr[i] = arr[i];
            // then insert x at pos
            else if (i == pos-1)
                newarr[i] = x;
           
            // then insert rest of the elements
             else
                newarr[i] = arr[i-1];
        }
        return newarr;
    }
 
    
    public static void main(String[] args)
    {
 
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int pos = sc.nextInt();
        int x = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
 
        arr = insertX(n, arr, x, pos);
 
        // print the updated array
        System.out.println(Arrays.toString(arr));
    }
}
