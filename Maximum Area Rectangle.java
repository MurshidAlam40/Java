import java.io.*;
import java.util.*;

// Pair class
class Rectangle{
    int length;
    int breadth;
    
    // Constructor
    public Rectangle(int x, int y){
        this.length = x;
        this.breadth = y;
    }
    
    // Funtion to find area
    public int area(){
        return (this.length*this.breadth);
    }
}
class maxArea{
    
    static int calculate_Area(Rectangle arr[]){
        
        // Your code here
        int max_Area = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int tempArea = arr[i].length * arr[i].breadth;
            if(tempArea > max_Area){
                max_Area = tempArea;
            }
        }
        return max_Area;
    }
    
}
class GFG {
    
    // Driver code
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    // Creating an array of Pair
	    Rectangle arr[] = new Rectangle[N];
	    
	    // Taking input length and breadth
	    for(int i = 0;i<N;i++){
	        int length = sc.nextInt();
	        int breadth = sc.nextInt();
	        arr[i] = new Rectangle(length, breadth);
	    }
	    
	    maxArea obj = new maxArea();
	    System.out.println(obj.calculate_Area(arr));
	}
}
