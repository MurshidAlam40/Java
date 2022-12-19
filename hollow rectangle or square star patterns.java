
import java.util.Scanner;
class Main {
    
public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        square(row, col);
    }
public static void square(int row, int col){
        //Complete the code given below
        /*
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++)
                if(i==0 || i==row-1 || j==0){
                    System.out.print("*"+" ");
                    
                }
                else if(j==col-1){
                    System.out.print("*"+" "); 
                    
                }
                else{
                   System.out.print(" "+" ");
                   
                }
                System.out.println();
        }
        */
		  for(int i=1; i<=row; i++){
			  for(int j=1; j<=col; j++){
				  if (i == 1 || i == row ||
					  j == 1 || j == col)		
					    System.out.print("* ");		
				    else
					    System.out.print("  ");		
			  }
			  System.out.println();
		  }
    }
}
