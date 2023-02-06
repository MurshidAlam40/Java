class A{
    public void display(){
        System.out.print("\t A");
    }
}
class B extends A{
    public void display(){
        System.out.println("\t B");
    }
}

public class Question7_RunTimePolymorphism {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        A obj3 = new B();
        A obj4;
        obj4 = obj1;
        obj4.display();
        obj4 = obj2;
        obj4.display();
        obj4 = obj3;
        obj4.display();
    }
}
