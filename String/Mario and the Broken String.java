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
    		String s = read.next();
    		// Update the code below to solve the problem
    		
            int j = 0;
            int flag = 0;
            
            while(j < n/2){
                if(s.charAt(j) == (s.charAt(n/2+j))){
                    j++;
                }
                else{
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
		}
	}
}
