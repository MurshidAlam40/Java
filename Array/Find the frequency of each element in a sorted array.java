import java.util.*;
import java.io.*;

class FreqOfEachElems{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        printFreq(arr, n);
    }
 
    public static void printFreq(int arr[], int n){
        // Code here
        /*
        int freq = 1;
        
        for(int i=1; i<n; i++){
            
            if(arr[i] == arr[i-1]){
                freq++;
            }
            else{
                System.out.println("Frequency of "+ arr[i-1]+" is "+freq);
                freq = 1;
            }
        }
        System.out.println("Frequency of "+arr[n-1]+" is "+ freq);
        */
        /*
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val : arr){
            if(!map.containsKey(val)){
                map.put(val, 1);
            }
            
            else{
                map.put(val, map.get(val)+1);
            }
        }
        for(int val : map.keySet()){
            System.out.println("Frequency of "+ val+" is "+map.get(val));
        }
        */
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            
            else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        for(int val : map.keySet()){
            System.out.println("Frequency of "+ val+" is "+map.get(val));
        }
    }
}
