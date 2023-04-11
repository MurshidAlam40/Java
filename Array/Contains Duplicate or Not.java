import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	
        int n = sc.nextInt();
        long a[] = new long[(int)(n)];
        
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        
        Solution obj = new Solution();
        System.out.println(obj.PartyType(a, n));
	
	}
}

class Solution {

    public static String PartyType( long a[], int n){
        // Your code goes here
        // Brote force
        /*
        Arrays.sort(a);
        
        for(int i=1; i<n; i++){
            if(a[i] == a[i-1])
                return "BOYS";
        }
        
        return "GIRLS";
        */
        
        //using hashset

        HashSet<Long> set = new HashSet<>();

        for(int i=0; i<n; i++){
            // If already present n hash, then we found a duplicate return true
            if(set.contains(a[i]))
                return "BOYS";
            // Add this item to hashset
            set.add(a[i]);
        }
        return "GIRLS";
    }
}
