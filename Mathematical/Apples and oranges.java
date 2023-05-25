import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t;i++){
		    int n = read.nextInt();
		    int m = read.nextInt();
		    
		    if(n%m == 0){
		        System.out.println(m);
		    }
		    while (m != 0) {
                int temp = m;
                m = n % m;
                n = temp;
            }
		    System.out.println(n);
		}
	}
}
