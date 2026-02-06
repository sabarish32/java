
import java.util.*;
class Balance{
    private int balance;
    Balance(int balance){
      this.balance=balance;
    }
    void calculate(){
        if(balance>=10000){
            int balance1=balance*6/100;
            int balance2=balance+balance1;
            System.out.println("Intrest:"+balance1+"\n"+"Total Amount:"+balance2);
        }
        else{
             int balance1=balance*4/100;
             int balance2=balance+balance1;
            System.out.println("Intrest:"+balance1+"\n"+"Total Amount:"+balance2);
        }
    }
}
public class Q7{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        Balance obj=new Balance(balance);
        obj.calculate();
    }
}
