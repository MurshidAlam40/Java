import java.io.*;
class parent{
    void fun(){
        System.out.println("Parent's fun ");
    }  
}
class child extends parent{
    @Override
    void fun(){
        System.out.println("child's fun ");
    }
}
class Grandchild extends child{
    @Override
    void fun(){
        System.out.println("Grandchild's fun ");
    }
}

class main {
	public static void main (String[] args) {
	    parent p1 = new child();
	    parent p2 = new Grandchild();
	    p1.fun();
	    p2.fun();
	}
}
