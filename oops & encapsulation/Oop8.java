import java.util.*;
class test{
    int n;
    void input(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    }
    void dis(){
        System.out.print("value"+n);
    }
    }
public class Oop8{
    public static void main(String[]args){
        test q=new test();
        q.input();
        q.dis();
    }
}
