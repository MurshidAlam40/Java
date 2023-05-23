import java.lang.Math;
import java.math.BigInteger;

class Codechef
{
    public static void main(String[] args)
    {
        int n = 25;
        System.out.println(Math.sqrt(n));


        // you have to create two BigInteger objects that takes input in String format
        BigInteger a = new BigInteger("16");
        BigInteger b = new BigInteger("24");
        System.out.println(a.gcd(b));

        double n1 = 1.89;
        System.out.println(Math.floor(n1));

        double n2 = 0.21;
        System.out.println(Math.ceil(n2));

        int x = 6;
        int y = 3;
        System.out.println(Math.pow(x, y));
    }
}
