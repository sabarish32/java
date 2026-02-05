import java.util.*;
class test{
      int n,a,b,c;
    void input(){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();

    }
    void dis(){
       if(n<2){
        System.out.print(a+b);
       }
            
            else{
            System.out.print(a-b);

            }
            }
        }
public class Oop6{
    public static void main(String[] args) {
        test q=new test();
        q.input();
        q.dis();

    }
}


        