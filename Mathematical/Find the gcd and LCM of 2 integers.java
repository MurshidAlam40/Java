import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int A = read.nextInt();
            int B = read.nextInt();
            
            // create an array to hold divisors of A and B
            int[] divisors_AandB = new int[Math.min(A, B)];
            int j = 1, k = 0;
            while (j <= Math.min(A, B)){
                // j needs to divide both A and B
                if (A%j == 0 && B%j == 0){
                    // append the integer to the array
                    divisors_AandB[k++] = j;
                }
                j++;
            }
            int gcd = 0;
            // gcd is the greatest common divisor
            for (int l = 0; l < k; l++){
                if (divisors_AandB[l] > gcd){
                    gcd = divisors_AandB[l];
                }
            }
            int lcm = (A * B) / gcd;
            System.out.println(gcd + " " + lcm);
        }
    }
}
