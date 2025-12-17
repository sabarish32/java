import java.util.Scanner;
public class twistedprime {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int rev=0;

        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }
        int count=0;
        for(int i=1;i<=rev;i++)        // twistedprime 13 rev=31 ..both are prime 
        {
            if(rev%i==0)
            {
                count++;
            }
        }
        if(count==2)
            System.out.println("twistedprime");
        else
            System.out.println("not a twistedprime");
    }
    
}
