import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = new Solution().getOddOccurrence(arr, n);
        System.out.println(ans);
    }
}

class Solution {
    int getOddOccurrence(int[] arr, int n) {
        // code here
        //brute force
        /*
        int i;
        for(i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count%2 != 0)
                return arr[i];
        }
        return -1;
        */
        /* 
        The Best Solution is to do bitwise XOR of all the elements.
        XOR of all elements gives us odd occurring elements. 

        Here ^ is the XOR operators;
        Note :
        x^0 = x
        x^y=y^x (Commutative property holds)
        (x^y)^z = x^(y^z) (Distributive property holds)
        x^x=0
        */
        int count = 0;
        for(int i=0; i<n; i++){
            count = count ^ arr[i];
        }
        return count;
    }
}
