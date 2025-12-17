import java.util.Scanner;
public class strongnumber {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=1;
        int sum1=0;
        while(n>0)
        {
            int rem=n%10;
            for(int i=1;i<=rem;i++)      //145( 5!+4!=1!=145) same means strong number
            {
                sum=sum*i;
            }
            sum1=sum1+sum;
            n=n/10;
            sum = 1;
        }
        if(sum1==temp)
            System.out.println("Strong number");
        else
            System.out.println("Not a strong number");
    }
    
}
