import java.util.*;
class Item{
    private int balance;
    Item(int balance){
        this.balance=balance;
    }
    void money(int pamnt){
        if(balance<=pamnt){
            System.out.println("INsufficient balance");
        }
        else{
           balance-=pamnt;
            System.out.println("Remaining Balance: "+balance);
        }
    }
}
public class Shopping5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        int pamnt=sc.nextInt();
        Item obj=new Item(balance);
        obj.money(pamnt);
    }
}