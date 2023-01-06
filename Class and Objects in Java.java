import java.math.*;
import java.io.*;
import java.util.*;

class Complex
{
    int real, imag;

    void print()//method or function
    {
        System.out.println(real + " +i"+ imag);
    }

    Complex(int r, int i)//contructotr
    {
        real = r;
        imag = i;
    }

    void add(Complex C)//method or function
    {
        real += C.real;
        imag += C.imag; 
    }
}
public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
      
      Complex c1 = new Complex(10, 20);

      c1.print();

      Complex c2 = new Complex(20, 30);

      c1.add(c2);

      c1.print();   

    } 
} 

