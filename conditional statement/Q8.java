import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int last = n % 10;
        
        if(last % 3 == 0)
            System.out.println("Last digit divisible by 3");
        else
            System.out.println("Last digit not divisible by 3");
    }
}