interface Parent{

    void printInfo();
    //protected void printInfo();
   }
class Child implements Parent{
   // Note the change in access modifier
   public void printInfo(){
       System.out.println("I am in Child");
   }
}

public class interfac {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.printInfo();
    }
    
}
