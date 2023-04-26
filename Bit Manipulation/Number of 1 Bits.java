import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Solution ob = new Solution();
        int cnt = ob.setBits(N);
        System.out.println(cnt);
        }
    }
}


// User function Template for Java
class Solution {
    static int setBits(int N) {
        // code here
        //Using Brian Kernighan’s Algorithm: 
        int count = 0;
        while (N > 0) {
            N &= (N - 1);
            count++;
        }
        return count;
    }
}
