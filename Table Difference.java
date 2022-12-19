import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        difference(n1, n2);
        System.out.println();
       
    }
    public static void difference(int n1, int n2){
    
        //Write your code here
        /*
        int diff = n1 - n2;
        for(int i=1; i<11; i++){
            System.out.print(diff*i+" ");
        }
        */
        for(int i=1; i<11; i++){
            int a = n1*i;
            int b = n2*i;
            System.out.print(a - b +" ");
        }
    }
}
