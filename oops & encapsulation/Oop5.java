import java.util.*;
class text{
    int n;
    
    void input(){
        Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
    }
    void dis(){
        System.out.println("value"+n);
    }
}
public class Oop5{
    public static void main(String[]args){
        test q=new test();
        q.input();
        q.dis();   
     }
}
