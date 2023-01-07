import java.math.*;
import java.io.*;
import java.util.*;

class Point
{
    int x, y;

    Point(int a, int b)
    {
        x = a;
        y = b;
    }

    void print()
    {
        System.out.println("x = " + x + ", y = "+y);
    }
}
public class main
{ 
    public static void main(String[] args)throws IOException 
    { 
      
      Point p = new Point(10, 20);

      p.print();

    } 
} 

//default constructor

import java.math.*;
import java.io.*;
import java.util.*;

class Point
{
    int x, y;

  
    void print()
    {
        System.out.println("x = " + x + ", y = "+y);
    }
}
public class main
{ 
    public static void main(String[] args)throws IOException 
    { 
      
      Point p = new Point();

      p.print();

    } 
} 

