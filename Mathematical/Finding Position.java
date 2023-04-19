import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[]) throws IOException {
        Scanner read = new Scanner(System.in));
        long n = read.nextLong();
        Solution ob = new Solution();

        System.out.println(ob.nthPosition(n));
    }
}

class Solution {
    static long nthPosition(long n){
        // code here
              
       long selected = 0;
       
       while(n != 1){
           n = n/2;
           selected++;
       }
       
       return (long) Math.pow(2, selected);
    }
}
