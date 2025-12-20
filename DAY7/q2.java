import java.util.Scanner;
public class q2
{
    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);       // 1 2 3 4 5 = 14 13 12 11 10 ;;
       int n =sc.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++)
       {
          arr[i]= sc.nextInt();
       }
       int sum=0;

       for(int i=0;i<n;i++)
       {
          sum=sum+arr[i];
       }
       for(int i=0;i<n;i++){
         arr[i]=sum-arr[i];
         System.out.print(arr[i]+" ");
       }




    }
}