import java.util.Scanner;
public class oq6 {

public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    int a=10;
    int b=20;
    int temp=a;
    a=b;
    b=temp;
    System.out.println(a);
    System.out.println(b);
}
}