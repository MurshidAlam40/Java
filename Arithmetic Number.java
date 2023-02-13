import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        
        Solution ob = new Solution();
        System.out.println(ob.inSequence(A, B, C));
    }
}


class Solution{
    static int inSequence(int A, int B, int C){
        // code here
        /*
        while(Math.abs(A) <= Math.abs(B)){
            if(A == B)
                return 1;
            A += C;
        }
        return 0;
        */
        
        if(A == B)
            return 1;
        if((B > A && C > 0) || (A>B && C<0)){
            if((B-A)%C == 0)
                return 1;
        }
        return 0;
    }
}
