import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int chairs[] = new int[n];
        for(int i=0; i<n; i++){
            chairs[i] = sc.nextInt();
        }
        
        int passengers[] = new int[n];
        for(int i=0; i<n; i++){
            passengers[i] = sc.nextInt();
        }
        
 	    Solution ob = new Solution();
	    System.out.println(ob.findMoves(n, chairs, passengers));
    }
}

class Solution {
    public static int findMoves(int n, int[] chairs, int[] passengers) {
        // code here
        
        Arrays.sort(chairs);
        Arrays.sort(passengers);
        int count = 0;
        
        for(int i=0; i<n; i++){
            count += Math.abs(chairs[i] - passengers[i]);
        }
        return count;
    }
}
        
