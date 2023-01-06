// (A) Final Variable:
//local final variable
import java.io.*;

class main {
	public static void main (String[] args) {
		
		final int x;
		
		x = 100;
		
		System.out.println(x);
	}
}

//Instance Final Variable:
import java.io.*;

class Test {
    
    final int x = 100;
    
	public static void main (String[] args) {
		
		Test t =  new Test();
		
		System.out.println(t.x);
	}
}

//Static or Class Final Variable
import java.io.*;

class Test {
    
   static final int MAX = 100;
    
	public static void main (String[] args) {
		
		
		
		System.out.println(MAX);
	}
}

//Final Method

class Base{
  final void fun(){
    System.out.print("Base");
  }
  class derived extends Base{
    void fun(){
      System.out.print("Derived");//Error
    }
  }
}

//Final Class

final class Base{
  //statement
}
class Derived extends Base{//error
//statement
}

//Final Reference Variable

import java.io.*;

class Test {
    
    
	public static void main (String[] args) {
		
		final StringBuffer sb = new StringBuffer("Murshid");
		
		sb.append(" Alam");
		
		System.out.println(sb);
	}
}
