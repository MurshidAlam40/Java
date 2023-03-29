import java.math.BigInteger;
import java.util.*;

public class FactorialOfBigInteger{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(factorial(n)+" ");
    }

    public static BigInteger factorial(int n){
        BigInteger fact = new BigInteger("1");
        
        for(int i=2; i<=n; i++){
            BigInteger x = BigInteger.valueOf(i);
            
            fact = fact.multiply(x);
        }
        return fact;
    }
}
