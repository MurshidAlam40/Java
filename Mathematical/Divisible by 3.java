import java.util.Scanner;
class main
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int a = read.nextInt();
    		int b = read.nextInt();
    		
    		if(a%3==0 || b%3==0){
    		    System.out.println(0);
    		}
    		else{
    		    if(Math.abs(a-b)%3 == 0){
    		        System.out.println(1);
    		    }
    		    else{
    		        System.out.println(2);
    		    }
    		}
		}
	}
}
