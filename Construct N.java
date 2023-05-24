import java.util.Scanner;

class Main
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int n = read.nextInt();
    		// Update your code below this line to solve the problem
    		if(n == 1 || n == 3 || n == 5){
    		    System.out.println("NO");
    		}
    		else{
    		    System.out.println("YES");
    		}
		}
	}
}
