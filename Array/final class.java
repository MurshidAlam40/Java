final class A{
    int i;
}
class B extends A{
    int j=0;
    System.out.println(j+" "+i);
}

public class Question6_FinalClass {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
