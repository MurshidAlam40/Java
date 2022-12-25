import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int max = Math.max(a, b);
        int mult = a*b;
        int ans = max;
    
        for(int i=max; i<=mult; i++){
            if(i%a == 0 && i%b == 0){
                ans = i;
                break;
            }
        }
        System.out.print(ans);
    }
}
