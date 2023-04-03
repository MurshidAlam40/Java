import java.io.*;
import java.util.*;
class Main {
    
    // compute reverse of a number
    public static long rev(long n){
        long rev_num = 0;
         while(n > 0) 
          { 
            rev_num = rev_num*10 + n%10; 
            n = n/10; 
          } 
          return rev_num;
    }
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
    Solution obj=new Solution();

    int N;
    N=sc.nextInt();
    int R=0;
    // reverse the given number n
    R=(int)rev(N);
    //power of the number to it's reverse
    long ans=(long)obj.power(N,R);
    System.out.println(ans);
	}
}


class Solution{
        
    long power(int N,int R){
        //Your code here
        long mod = 1000000007;
        
        if(R == 0){
            return 1;
        }
        
        long pow = power(N, R/2)%mod;
        
        if(R%2 == 0){
            return (pow*pow)%mod;
        }
        
        else{
            return (N*power(N, R-1))%mod;
        }
    }
}
