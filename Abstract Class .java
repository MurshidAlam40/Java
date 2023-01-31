abstract class Parent{

    abstract void printInfo();
    //protected void printInfo();
   }
class Child extends Parent{
   // Note the change in access modifier
   public void printInfo(){
       System.out.println("I am in Child");
   }
}

public class Question12_abstractClass {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.printInfo();
    }
    
}
