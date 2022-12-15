import java.util.Scanner;

class Main {

public static void utility(int a, int b){
    int ans = a >> b;
    System.out.println(ans);
}
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        utility(a, b);
       
    }
}
