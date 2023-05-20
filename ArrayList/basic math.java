import java.util.*;
class Main
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		int ele;
		for(int i=0; i<t; i++)
		{
    		int n = read.nextInt();
    		ArrayList<Integer> a = new ArrayList<Integer>();
    		
    		// Update your code below this line to solve the problem
    		
    		for(int j=1; j<=n; j++){
    		    if(n%j == 0){
    		        a.add(j);
    		    }
    		}
    		
    		for(int k=0; k<a.size(); k++){
    		    System.out.print(a.get(k)+" ");
    		}
    		System.out.println();
		}
	}
}
