import java.io.*;

class Parent{
    int i;
    void display(){
        System.out.println(i);
    }
}
class Child extends Parent{
    int j;
    void display(){
        System.out.println(j);
    }
}

class Question {
	public static void main (String[] args) {
	    Child obj = new Child();
	    obj.i=1;
	    obj.j=2;
		obj.display();
	}
}
