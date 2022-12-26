import java.util.Scanner;

class Main {
    //First Method
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printFactors(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                int x=i;
                while(n%x==0){
                    System.out.print(i+" ");
                    x=x*i;
                }
            }
        }
    }
//secound Method
/*
for(int i=2;i<=n; ){

        if(n%i == 0){
            n = n/i;
            System.out.print(i+" ");
        }
        else{
            i++;
        }
    }
}
*/
//driver
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        printFactors(n);
    }
}

