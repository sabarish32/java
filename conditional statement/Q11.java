import java.util.Scanner;
class Q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int firstDigit = Math.abs(n) / 100;

        if (firstDigit % 2 == 0)
            System.out.println("First digit is Even");
        else
            System.out.println("First digit is Odd");
    }
}
