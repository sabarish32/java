import java.util.*;
class mark{
    int m1,m2,m3,total,avg;
    Scanner sc=new Scanner(System.in);
    void input(){
    m1=sc.nextInt();
    m2=sc.nextInt();
    m3=sc.nextInt();
    }
    void dis(){
        total=m1+m2+m3;
        avg=total/3;
        System.out.print(total+" ");
        System.out.print(avg);
    }
}
public class Oop3{
    public static void main(String[]args){
        mark q=new mark();
        q.input();
        q.dis();

    }
}
   