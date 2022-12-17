import java.util.Scanner;

class Main {
    
     public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
       
        int n = scn.nextInt();
        countDigits(n);
        //System.out.println();
    }
    public static void countDigits(int n){

        //write your code here
        //print number of digits in n
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
            //count = count + 1;
        }
        System.out.print(count);
    }

}
