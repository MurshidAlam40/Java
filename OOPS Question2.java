import java.io.*;

class Parent{
    int i;
}
class Child extends Parent{
    int j;
    void display(){
        super.i = j+1;
        System.out.println(j+" "+i);
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
