import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
	        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            int arr[] = new int[n];
            
            
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(arr, n, x); 
            
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
    } 
} 
            

class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        int index = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                ar.add(i);
                index = 1;
                break;
            }
        }
        
        for(int i=n-1; i>=0; i--){
            if(arr[i] == x){
                ar.add(i);
                break;
            }
        }
        
        if(index == 0){
            ar.add(-1);
        }
        
        return ar;
    }
}
