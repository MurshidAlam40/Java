import java.math.*;
import java.io.*;
import java.util.*;

class Point
{
    int x, y;

    Point(int x, int y)
    {
        this.x = y;
        this.y = y;
    }

    void print()
    {
        System.out.println(x+" "+y);
    }
}
public class main
{ 
    public static void main(String[] args)throws IOException 
    { 
      
      Point p1 = new Point(10, 20);
      
      Point p2 = new Point(5, 15);

     

    } 
} 

//2

import java.math.*;
import java.io.*;
import java.util.*;

class Point
{
    int x, y;

    Point(int x, int y)
    {
        this.x = y;
        this.y = y;
    }

    Point setX(int x)
    {
        this.x = x;
        
        return this;
    }
    
     Point setY(int y)
    {
        this.y = y;
        
        return this;
    }
}
public class main
{ 
    public static void main(String[] args)throws IOException 
    { 
      
      Point p1 = new Point(10, 20);
      
      Point p2 = new Point(5, 15);
      
      p1.setX(2).setY(3);

     

    } 
} 

//3


import java.math.*;
import java.io.*;
import java.util.*;

class Point
{
    int x, y;

    Point(int x, int y)
    {
        this.x = y;
        this.y = y;
    }

   Point()
   {
       this(10, 10);
   }
}
public class main
{ 
    public static void main(String[] args)throws IOException 
    { 
      
      Point p1 = new Point(10, 20);
      
    
     

    } 
} 

