import java.util.Scanner;
public class magicnumber {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
       
        int s=sum;              //1729 (1729 = 1+7+2+9 =19 rev= 91 .19*91 = 1729.. magic number)
        int k=0;
        while(s>0)
        {
            int r=s%10;
            k= k*10+r;
            s=s/10;
        }
        int ans= sum*k;
        if(ans==temp)
            System.out.println("Magic Number");
        else
            System.out.println("Not a magic number");
    }
    
}
