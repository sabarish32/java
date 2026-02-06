import java.util.*;
class test{
      int n,odd=0;even=0;
    void input(){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    void dis(){
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num%2==0){
                even++;
            }
            else{
                odd++;

            }
            }
        }
public class Oop7{
    public static void main(String[] args) {
        test q=new test();
        q.input();
        q.dis();

    }
}


        