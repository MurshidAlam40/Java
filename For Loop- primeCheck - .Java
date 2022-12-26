import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Geeks obj = new Geeks();

        // caling isPrime method
        // with n as argument
        obj.isPrime(n);
    }
}

// User function Template for Java

class Geeks {
    static void isPrime(int n) {
        if(n == 1){
            System.out.println("No");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Your code here
            if(n % i == 0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
