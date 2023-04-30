import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int n = read.nextInt();
    		int x = read.nextInt();
    		// Update your code below this line to solve the problem

    		int op1 = x;
    		int op2 = n-x;
    		System.out.println(Math.min(op1, op2));
		}
	}
}
