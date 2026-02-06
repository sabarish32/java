import java.util.*;
class Exam{
       private  int m1,m2,m3,m4,m5;
       Exam(int m1,int m2,int m3,int m4,int m5){
              this.m1=m1;
              this.m2=m2;
              this.m3=m3;
              this.m4=m4;
              this.m5=m5;
       }
       void display(){
              if(m1<35||m2<35||m3<35||m4<35||m5<35){
                     System.out.println("Fail");
              }
              else{
                int marks;
                marks=(m1+m2+m3+m4+m5)/5;
                System.out.println("Result:pass"+"\n"+"Total percentage: "+marks);
              }
       }
}
public class Q10{
       public static void main(String[]args){
              Scanner sc=new Scanner(System.in);
              int m1=sc.nextInt();
              int m2=sc.nextInt();
              int m3=sc.nextInt();
              int m4=sc.nextInt();
              int m5=sc.nextInt();
              Exam obj=new Exam(m1,m2,m3,m4,m5);
              obj.display();
       }
}
                     
              