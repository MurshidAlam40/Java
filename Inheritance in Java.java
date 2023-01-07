import java.util.*;

class Employee{
    int id;
    int salary;
    Employee(int i, int s){
        id = i;
        salary = s;
    }
}
class salesEmp extends Employee{
    int salesInc;
    salesEmp(int i, int s, int si){
        super(i, s);
        salesInc = si;
    }
}
class Test{
    public static void main(String []args){
        salesEmp se = new salesEmp(101,30000,10000);
        System.out.println(se.salary);
        System.out.println(se.id);
        System.out.println(se.salesInc);
    }
}
