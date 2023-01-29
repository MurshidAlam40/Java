import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
            int a;
            a = sc.nextInt();
            
            
            int b;
            b = sc.nextInt();
            
            Solution obj = new Solution();
            int res = obj.solve(a, b);
            
            System.out.println(res);
    }
}

class Solution {
    public static int solve(int a, int b) {
        // code here
        
        int count = 0;
        while (a != b) {
            if (a < b) {
                b = b & a;
            }
            else {
                a = a & b;
            }
            count++;
        }
        return count;
    }
}
