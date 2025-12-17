import java.util.Scanner;
public class perfectnumber {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;

        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
              count=count+i;               // 6 (factors of 6= 1,2,3|| 1+2+3=6)
            }
        }
        System.out.println(count);
        if(count==n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a perfect number");
    }
    
}
