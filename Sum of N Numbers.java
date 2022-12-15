import java.util.*;
import java.util.Scanner;
public class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = nSum(n);
        System.out.println(ans);
    }
    public static int nSum(int n){
        int ans = 0;
    
        //Write your code here to calculate and return sum of n number.
        ans = 0;
        for(int i=1; i<=n; i++){
            ans = ans + i;
        }
        return ans;
      /*
      //recursive methods
      return n*(n + 1)/2;
      */
    }
}
