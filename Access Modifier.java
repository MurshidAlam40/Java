class Parent{

     protected void printInfo(){
        System.out.println("I am in Parent");
    }
}
class Child extends Parent{
    // Note the change in access modifier
    void printInfo(){
        System.out.println("I am in Child");
    }
}

class Question11{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.printInfo();
    }
}
