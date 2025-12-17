import java.util.Scanner;
public class adamnumber {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n*n;
        int rev=0;

        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;        //12 = 12*12=144||rev of 12 =21|| 21*21=441|| rev of 441=144 
            n=n/10;               //12*12 -144 == rev of 441=144 
        }
        int r=rev*rev;
        int rev1=0;

        while(r>0)
        {
            int rem1=r%10;
            rev1=rev1*10+rem1;
            r=r/10;
        }
        if(temp==rev1)
            System.out.println("adam number");
        else
            System.out.println("not a adam number"); 

    }
    
}
