import java.io.*;
class parent{
    static void fun(){
        System.out.println("Parent's fun ");
    }  
}
class child extends parent{
    static void fun(){
        System.out.println("child's fun ");
    }
}

class main {
	public static void main (String[] args) {
	    parent p = new child();
	    p.fun();
	}
}
/*
Output:
Parent's fun 
*/


// We can call the parent's method using super

import java.io.*;
class parent{
    void fun(){
        System.out.println("Parent's fun ");
    }  
}
class child extends parent{
    @Override
    void fun(){
        super.fun();
        System.out.println("child's fun ");
    }
}

class main {
	public static void main (String[] args) {
	    parent p = new child();
	    p.fun();
	}
}

/* 
Output:
Parent's fun 
child's fun 
*/
