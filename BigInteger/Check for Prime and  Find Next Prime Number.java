
import java.util.Scanner;
import java.math.BigInteger;

class Prime{
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        
        System.out.println(isPrime(n));
        System.out.println(nextPrime(n));
    }
    
    public static boolean isPrime(int n){
        BigInteger b = BigInteger.valueOf(n);
        return b.isProbablePrime(n);
    }
    
    public static int nextPrime(int n){
        BigInteger b = BigInteger.valueOf(n);
        String s = b.nextProbablePrime().toString();
        
        return Integer.parseInt(s);
    }
}
