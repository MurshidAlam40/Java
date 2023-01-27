import java.io.*;
import java.util.*;

class Solution
{
    boolean check_elements(int arr[], int n, int A, int B)
    {
        int rang = 0;
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            rang = arr[i];
            if(rang == A){
                A++;
            }
            if(A > B)
                return true;
        }
        return false;
    }
}


class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int k =sc.nextInt();
            int y =sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
//           
//            long b[] = new long[n];
//            for (int i = 0; i < m; i++) {
//                b[i] = sc.nextLong(a2[i]);
//            }
            Solution ob = new Solution();
            boolean ans=ob.check_elements(a,n,k,y);
           // System.out.println(ob.shuffleArray(a,n,k,y));
            if(ans)
            System.out.println("Yes");
            else
            System.out.println("No");
    }
}
