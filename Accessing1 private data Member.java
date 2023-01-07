import java.util.*;

class base{
    private int x = 10;
    public int getx(){
        return x;
    }
}
class Derived extends base{
    int y = 20;
    void print(){
        System.out.println(getx());
        System.out.println(y);
    }
}
class Test{
    public static void main(String []args){
        Derived d = new Derived();
        d.print();
    }
}
