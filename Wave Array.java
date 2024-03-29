import java.io.*;
import java.util.*;
import java.util.Arrays;

class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n; 
        n = Integer.parseInt(br.readLine());


        int[] a = IntArray.input(br, n);

        Solution obj = new Solution();
        obj.convertToWave(n, a);
        StringBuffer sb=new StringBuffer("");
        for(int i : a){
            sb.append(i+" ");
        }
        System.out.println(sb.toString());
    }
}

class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        Arrays.sort(a);
        
        for(int i=0; i<n-1; i += 2){
            swap(a, i, i+1);
        }
    }
    public static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
        
