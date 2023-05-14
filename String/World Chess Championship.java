import java.util.Scanner;
class Main
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int x = read.nextInt();
    		String s = read.next();
    		// Update the code below to solve the problem
            
            int carlsen = 0;
            int chef = 0;
            int j = 0;
            
            while(j < 14){
                if(s.charAt(j) == 'C'){
                    carlsen = carlsen + 2;
                }
                else if(s.charAt(j) == 'N'){
                    chef = chef + 2;
                }
                else{
                    carlsen = carlsen + 1;
                    chef = chef + 1;
                }
                j++;
            }
    		
    		if(carlsen > chef){
    		    System.out.println(60*x);
    		}
    		else if(carlsen == chef){
    		    System.out.println(55*x);
    		}
    		else{
    		    System.out.println(40*x);
    		}
		}
	}
}
