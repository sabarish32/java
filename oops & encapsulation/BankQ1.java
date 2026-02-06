import java.util.*;
class Employee{
       int balance;
       int withdraw;
       
       void withdraw(){
              if(withdraw >0){
                     if(withdraw<=balance){
                            balance=balance-withdraw;
                        System.out.println("withdraw successfull"+"\n"+"remaining balance: "+balance);
                     }
              } else{
                     System.out.println("rejection successfull"+"\n"+"remaining balance: "+balance);
              }
       }
}
public class BankQ1{
       public static void main(String[]args){
              Scanner sc=new Scanner(System.in);
              Employee emp=new Employee();
              emp.balance=sc.nextInt();
              emp.withdraw=sc.nextInt();
              emp.withdraw();
       }
}