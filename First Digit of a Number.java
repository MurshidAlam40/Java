import java.util.Scanner;

class Main {
    
    public static int printFirst(int n){
        while(n>10){
           n=n/10;
       }
       return n;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        System.out.print(printFirst(n));
    }
}

//secound method

import java.util.Scanner;

class Main {
    
    public static int firstDigit(int n){
        double power=Math.log10(n);
        int p=(int)power;
        int a=(int)Math.pow(10,p);
        int ans=n/a;
        return ans;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        System.out.print(firstDigit(n));
    }
}
