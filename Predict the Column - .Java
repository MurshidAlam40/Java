import java.io.*;
import java.util.*;
class Geeks{
    
    static int columnWithMaxZero(int a[][],int n){
        
        // Your code here
        int ans = 0;
        int max = Integer.MIN_VALUE;
        
        for(int col=0; col<n; col++){
            int count = 0;
            for(int row=0; row<n; row++){
                if(a[row][col] == 0)
                    count++;
            }
            if(count > max){
                max = count;
                ans = col;
            }
        }
        return ans;
    }
}
class GFG {
    
    // Driver code
	public static void main (String[] args) {
	    // Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		    
		    //taking size of 2d-array
		    int n = sc.nextInt();

            //creating a 2d-array
		    int a[][] = new int[n][n];
		    
		    //adding elements to the array
		    for(int i = 0;i<n;i++){
		        for(int j = 0;j<n;j++){
		            a[i][j] = sc.nextInt();
		        }
		    }
		    
		    //creating an object of Geeks clas
		    Geeks obj = new Geeks();
		    
		    //calling the method columnWithMaxZero()
		    //of class Geeks
		    System.out.println(obj.columnWithMaxZero(a, n));
	}
}
