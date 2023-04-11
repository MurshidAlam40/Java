import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();

        Solution ob = new Solution();
        int ans = ob.solve(a, b, c);
        
        System.out.println(ans);
	
	}
}

 class Solution {
    int solve(int a, int b, int c) {
        // code here
        int max = a+b+c;
        
        if(a > 2*(b+c)+2 || b > 2*(a+c)+2 || c > 2*(a+b)+2){
            return -1;
        }
        
        return max;
        
    }
};
