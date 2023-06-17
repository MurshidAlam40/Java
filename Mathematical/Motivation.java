class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int movies = 0;
		    for(int i=0; i<n; i++){
		        int Si = sc.nextInt();
		        int Ri = sc.nextInt();
		    
		        if(x >= Si){
		            movies = Math.max(movies, Ri);
		        }
		    }
		    System.out.println(movies);
		}
	}
}
