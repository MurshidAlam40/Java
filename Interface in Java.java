
import java.io.*;
//interface calss
interface MyInt{
    default void fun(){
        System.out.println("fun()");
    }
    static void fun2(){
        System.out.println("fun2()");
    }
    void fun3();// by default abstract
}
class Test implements MyInt{
   public void fun3(){
       System.out.println("fun3()");
   }

	public static void main (String[] args) {
	    Test t = new Test();
		  t.fun();
		  MyInt.fun2();
		  t.fun3();
	}
}
