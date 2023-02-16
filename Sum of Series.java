import java.util.Scanner;

public class StringTransformer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long ans = new Solution().seriesSum(n);

        System.out.println(ans);
    }
}


class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        // code here
        
        //long sum = (n*(n+1))/2;
        //return sum
        return (((long) n *(n+1)/2));
        
    }
}
