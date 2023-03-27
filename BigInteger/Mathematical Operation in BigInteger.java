//Some Important operation on BigInteger
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class MathematicalOperation{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x = sc.nextBigInteger();
        BigInteger y = sc.nextBigInteger();
        Solution obj = new Solution();
        
        System.out.println(obj.operation(x, y));
        
    }
}

class Solution{
    static BigInteger operation(BigInteger x, BigInteger y){
        BigInteger sum = x.add(y);
        
        BigInteger mult = x.multiply(y);
        
        BigInteger div = x.divide(y);
        
        return sum;
    }
}
