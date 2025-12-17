import java.util.Scanner;
public class q4 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);       
        int n = sc.nextInt();

        for(int i=5;i<=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
