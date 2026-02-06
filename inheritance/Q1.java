
import java.util.*;
class Employee{
    int salary;
    Employee(int salary){
        this.salary=salary;
    }
    int csalary(){
        return salary;
    }
}
class Manager extends Employee{
    int hra;
    int da;
    Manager(int salary,int hra,int da){
        super(salary);
        this.salary=salary;
        this.hra=hra;
        this.da=da;
    }
    int csalary(){
        return salary+hra+da;
    }
}
public class Q1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("BASIC SALARY:");
        int bsalary=sc.nextInt();
        System.out.println("HRA:");
        int hra=sc.nextInt();
        System.out.println("DA:");
        int da=sc.nextInt();
        Employee obj=new Manager(bsalary,hra,da);
        System.out.println("Total salary:"+obj.csalary());
    }
}