
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
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=2*i-1){
                System.out.print("*"+" ");
                k++;
            }
            i++;
            System.out.println();
        }
        */
        
		for(int i=1; i<=n; i++){
			for(int j=n-i; j>=1; j--){
				System.out.print(" ");		
			}
			
			for(int k=1; k<=(2*i-1); k++){
			    System.out.print("*");
			}
			System.out.println();
		}
		
    }
}
