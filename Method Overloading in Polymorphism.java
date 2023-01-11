

class Addition
{
    static int sum(int a, int b)
    {
       return (a+b);
    }
    static int sum(int a, int b, int c)
    {
       return (a+b+c);
    }

}

class Test
{
    
    public static void main(String[] args)
    {
        //Don't need to create objects
        //We have defined sum Method as static
        System.out.println(Addition.sum(5,5));
        System.out.println(Addition.sum(5,5,5));
    }
 /*
 Output:
10
15
*/
 
// Another
  
  import java.io.*;
class sum{
    public int sum(int x, int y){
        return (x+y);
    }
    public int sum(int x, int y, int z){
        return (x+y+z);
    }
    public double sum(double x, double y){
        return (x+y);
    }
}

class main {
	public static void main (String[] args) {
	    sum s = new sum();
		System.out.println(s.sum(10,20));
		System.out.println(s.sum(10.5,20.5));
	}
}
  // output
  /*
  30
31.0
*/
