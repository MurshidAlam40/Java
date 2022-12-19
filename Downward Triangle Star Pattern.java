
import java.util.Scanner;
class Pattern {
    
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        /*
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print("*"+" ");
                j++;
            }
            System.out.println();
            i++;
        }
        */
        
		for(int i=n-1; i>=0; i--){
			for(int j=1; j<=i; j++){
				System.out.print("* ");		
			}
			System.out.println();
		}
		
    }
}
