import java.io.*;
import java.util.*;

public class SubstringsOfString{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        Solution ob = new Solution();
        System.out.println(ob.search(x, y));
    }
}

class Solution {
    int search(String X, String Y) {
        // code here
      
        int index = X.lastIndexOf(Y);
        
        if(index == -1)
            return -1;
            
        return index+1;
    }
}
