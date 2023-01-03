import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking size of arary
        int sizeof_array = sc.nextInt();

        // creating an array
        int a[] = new int[sizeof_array];

        // inserting elements in the array
        for (int i = 0; i < sizeof_array; i++) {
            a[i] = sc.nextInt();
        }

        // creating an object of class Geeks
        Geeks obj = new Geeks();

        // calling countOddEven() method
        // of class Geeks
        obj.countOddEven(a, sizeof_array);
        System.out.println();
    }
}
class Geeks {
    static void countOddEven(int a[], int n) {

        // Your code here
        int countEven = 0;
        int countOdd = 0;
        for(int i=0; i<n; i++){
            if(a[i]%2 == 0)
                countEven++;
            else
                countOdd++;
        }
        System.out.print(countOdd+" "+countEven);
    }
}
