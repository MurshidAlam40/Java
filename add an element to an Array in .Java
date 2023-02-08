import java.io.*;
import java.util.*;
 
class addElement {
    /*
    // Function to insert x in arr at position pos
    public static int[] insertX(int n, int arr[], int x){
        
        // create a new array of size n+1
        int newarr[] = new int[n + 1];
   
       // insert old array into the new array
       for (int i = 0; i < n; i++){
            // insert all elements till n
           newarr[i] = arr[i];
        }
        // then insert x at n+1
       newarr[n] = x;
   
       return newarr;
       */
       public static Integer[] insertX(int n, Integer arr[], int x){
           
       ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
       
       list.add(x);
       arr = list.toArray(arr);
       
       return arr;
    }
 
    
    public static void main(String[] args)
    {
 
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();;
        int x = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
 
        arr = insertX(n, arr, x);
 
        // print the updated array
        System.out.println(Arrays.toString(arr));
    }
}
