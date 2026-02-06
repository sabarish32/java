
import java.util.*;
class Student{
    int rollno;
    String name;
    int cresult(){
        return rollno;
        
    }
}
class Result extends Student{
    int mark1;
    int mark2;
    int mark3;
    Result(int mark1,int mark2,int mark3){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    int cresult(){
        return mark1+mark2+mark3;
    }
}
public class Q2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int mark1=sc.nextInt();
        int mark2=sc.nextInt();
        int mark3=sc.nextInt();
        Student obj=new Result(mark1,mark2,mark3);
       System.out.println("Total marks:"+obj.cresult());
    }
}