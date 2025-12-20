import java.util.Scanner;
public class q3
{
    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);          // 1 2 3 4 5 = 14 12 9 5 0 ...
       int n =sc.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++)
       {
         
          arr[i]= sc.nextInt();
       }
       int sum=0,sum1=0;

       for(int i=0;i<n;i++)
       {
          sum=sum+arr[i];
       }
       for(int i=0;i<n;i++){
         int temp=sum;                                   //15  15  15  15   15
         for(int j=i;j<=i;j++){                          //1   3   6   10   15
            sum1=sum1+arr[j];                            //14  12  9   5    0
            arr[i]=temp-sum1;

            
         }
         System.out.print(arr[i]+" ");
       }




    }
}