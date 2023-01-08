//Use of super with variable

import java.io.*;

class Base{
    int x=10;
}
class Derived extends Base{
    int x=20;
    void print(){
        System.out.println(super.x);
        System.out.println(x);
    }
}

class main {
	public static void main (String[] args) {
		Derived d = new Derived();
		d.print();
	}
}

//Use of super with constructor

import java.io.*;

class Base{
    int x;
    Base(){
        int x=0;
    }
    Base(int i){
        int x=i;
    }
}
class Derived extends Base{
    int y;
    Derived(){
        super();//optional or default
        y=0;
    }
    Derived(int i, int j){
        super(i);
        y=j;
    }
}

class main {
	public static void main (String[] args) {
		Derived d = new Derived(10,20);
		System.out.println(d.x);
		System.out.println(d.y);
		
	}
}

//Use of super with methods


class Person {
    void message()
    {
        System.out.println("This is person class\n");
    }
}
class Student extends Person {
    void message()
    {
        System.out.println("This is student class");
    }
    void display()
    {
        message();
        super.message();
    }
}
class Test {
    public static void main(String args[])
    {
        Student s = new Student();
        s.display();
    }
}
