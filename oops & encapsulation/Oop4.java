import java.util.*;
class text{
    int id;
    int date,month,year;
    void input(){
        Scanner sc=new Scanner(System.in);
        id=sc.nextInt();
        date=sc.nextInt();
        month=sc.nextInt();
        year=sc.nextInt();
    }
    void dis(){
        System.out.println(id+" ");
        System.out.print(date+"/"+month+"/"+year);
    }
}
public class Oop4{
    public static void main(String[]args){
        test q=new test();
        q.input();
        q.dis();    }
}
