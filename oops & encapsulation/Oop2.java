import java.util.*;
class mark{
    int m1,m2,m3,total;
    
    void input(){
        Scanner sc=new Scanner(System.in);
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
    }
    void dis(){
        total=m1+m2+m3;
        System.out.println(total+" ");
    }
}
public class Oop2{
    public static void main(String[] args) {
        
        mark q=new mark();
        q.input();
        q.dis();
    }
}
  