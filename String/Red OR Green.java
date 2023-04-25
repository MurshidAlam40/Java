import java.io.*;
import java.util.*;

class Main {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
  
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.RedOrGreen(N, S));
    }
}


class Solution {
    static int RedOrGreen(int N, String S) {
        //code here
        int countR = 0;
        int countG = 0;
        
        for(int i=0; i<N; i++){
            if(S.charAt(i) == 'R')
                countR++;
            else
                countG++;
        }
        
        return Math.min(countR, countG);
    }
}
