import java.util.Scanner;
public class oq11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int ft= n/10; 
        int sd= ft%10;

        System.out.println(sd);
    }
}