import java.util.*;
class Recharge{
    private int balance;
Recharge(int balance){
        this.balance=balance;

    }
    void display(){
        if(balance>=100){
            System.out.println("Extend valdity by 28 days");
        }
        else{
            System.out.println("Recharge failed");
        }

    }
}
public class Q9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        Recharge obj=new Recharge(balance);
        obj.display();
    }
}
