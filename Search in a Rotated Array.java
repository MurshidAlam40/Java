import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        
        for (int i = 0;i < n;i++)
        {
            A[i] = in.nextInt(s[i]);
        }
        int key = in.nextInt();
        
        System.out.println(new Solution().search(A, 0, n - 1, key));
    }
}


class Solution
{
    int search(int A[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        /*
        l = 0;
        h = A.length;
        for(int i=l; i<h; i++){
            if(A[i] == key)
                return i;
        }
        return -1;
        */
        l = 0;
        h = A.length-1;
        while(l<h){
            if(A[l] == key)
                return l;
            if(A[h] == key)
                return h;
            l++;
            h--;
        }
        return -1;
    }
}
